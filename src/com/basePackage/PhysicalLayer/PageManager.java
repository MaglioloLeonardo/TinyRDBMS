package com.basePackage.PhysicalLayer;

import com.basePackage.ApplicationLayer.Settings;
import com.basePackage.UtilityLayer.Pair;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class PageManager {
    private static PageManager currentInstance = null;
    private final int maxSizePages = Settings.PageBufferByteSize;
    private int waitAsyncLoad = 300, checkAsyncLoad = 20;
    private final List<Pair<Page, Long>>[] pages = new List[maxSizePages/Page.MaxByteSize];
    private final AtomicInteger numberOfPages = new AtomicInteger(0);
    private final List<Pair<Table, Pair<Integer, Integer>>> sequencesOfPages = new ArrayList<Pair<Table, Pair<Integer, Integer>>>();
    private final List<Pair<String, Integer>> pendingPages = new ArrayList<Pair<String, Integer>>();
    //private ExecutorService IO_pool = Executors.newFixedThreadPool(Settings.IOPollStartSize);
    private final ThreadPoolExecutor IO_pool = new ThreadPoolExecutor(Settings.IOPollStartSize, Settings.IOPollStartSize,
            0L, TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<Runnable>());

    public static PageManager getPageManager(){
        if(currentInstance == null){
            currentInstance = new PageManager();
        }
        return currentInstance;
    };

    private PageManager(){
        for(int i = 0; i<pages.length; i++){
             pages[i] = new ArrayList<>();
        }
    }

    Page getPage(String tableName, int IDPage){
        return getPage(tableName, IDPage, null);
    }

    Page getPage(String tableName, int IDPage, Long sessionID){
        Page toReturn = findPagesInMemory(tableName, IDPage, sessionID);
        if(toReturn != null)return  toReturn;

        toReturn = loadPage(tableName, IDPage, sessionID);
        assert toReturn != null;

        if(sessionID != null){
            toReturn.setSessionID(sessionID);
        }
        return toReturn;
    }

    private List<Pair<Page, Long>> getListPage(int IDPage){
        return pages[IDPage%pages.length];
    }

    void fetchSequenceOfPages(Table table, int id_from, int id_to){
        if(id_from <= id_to){
            sequencesOfPages.add(new Pair<>(table,new Pair<>(id_from, id_to)));
        }
        fetchPendingPages();
    }

    void addNewPage(Page page){
        File f = null;
        if(page.getSessionID() == null){
             f = new File(FileUtility.getPathPage(page));
        }else  f = new File(FileUtility.getPathPage(page, page.getSessionID()));

        assert !f.exists();
        if (isFull()) clearPages();
        getListPage(page.getPID().second).add(new Pair<>(page, System.currentTimeMillis()));
        numberOfPages.incrementAndGet();
    }

    private boolean isFull(){
        synchronized (numberOfPages){
        if(numberOfPages.get() >= maxSizePages/Page.MaxByteSize){
            return true;
        }else return false;}
    }


    private void clearPages(){
        /*Pair<Page, Long> toRemove = findLRU();
        Page LRU = toRemove.first;
        assert LRU != null;
        UnloadPage(LRU);
        pages.remove(toRemove);*/
        //much faster without LRU without index implementation
        UnloadAllPages();
        while (numberOfPages.get() > 0){
            try {
                TimeUnit.MILLISECONDS.sleep(10);
            }catch (Exception e){}
        }
        fetchPendingPages();
    }

    private Page loadPage(String tableName, int IDpage, Long sessionID){
        return  loadPage(tableName, IDpage, sessionID, true);
    }

    private Page loadPage(String tableName, int IDpage, Long sessionID, boolean checkFull) {
        if(checkFull && isFull()) clearPages();
        Page p = null;
        if (sessionID == null){
            p = FileUtility.readPage(FileUtility.getPathPage(tableName, IDpage));
        }else p = FileUtility.readPage(FileUtility.getPathPage(tableName, IDpage, sessionID));
        assert p != null;

        p.setPID(new Pair<>(tableName, IDpage));
        p.setSessionID(sessionID);

        List<Pair<Page, Long>> listPage = getListPage(IDpage);
        synchronized (listPage){
            if(findPagesInMemory(p.getPID().first, p.getPID().second, sessionID) == null){
                listPage.add(new Pair<>(p, System.currentTimeMillis()));
                numberOfPages.incrementAndGet();
            }
        }
        return p;
    }

    private void asyncLoadPage(String tableName, int IDpage, Long sessionID){
        Pair<String, Integer> pending = new Pair<>(tableName, IDpage);
        synchronized (pendingPages){pendingPages.add(pending);}
        IO_pool.submit(()->{
            Page p = loadPage(tableName, IDpage, sessionID, false);
            synchronized (pendingPages){pendingPages.remove(pending);}
        });
    }

    private Page waitAsyncPagePending(String tableName, int IDPage, Long sessionID){
        synchronized (pendingPages) {
            for (Pair<String, Integer> pending : pendingPages) {
                if (pending.first.equals(tableName) && pending.second.equals(IDPage)) {
                    int timeWaited = 0;
                    while (timeWaited < waitAsyncLoad) {
                        try {
                            Thread.sleep(checkAsyncLoad);
                            timeWaited += checkAsyncLoad;
                            Page toReturn = findPagesInMemory(tableName, IDPage, sessionID);
                            if (toReturn != null) return toReturn;
                        } catch (Exception e) {
                        }
                    }
                }
            }
        }
        return null;
    }

    private void UnloadPage(Pair<Page, Long> pair){
        Page page = pair.first;
        int pageId = pair.first.getPID().second;
        boolean precDirty = page.isDirty();
        IO_pool.submit(()->{
            synchronized (page) {
                    page.setValid(false);
                try {
                    page.setDirty(false);
                    if(page.getSessionID() == null){
                        FileUtility.savePage(page);
                    }else FileUtility.savePage(page, FileUtility.getPathPage(page, page.getSessionID()));

                    List<Pair<Page, Long>> listPage = getListPage(pageId);
                    synchronized (listPage){
                        Pair<String, Integer> PID = pair.first.getPID();
                        List<Pair<String, Integer>> toRemove = new ArrayList<>();
                        for(Object obj: listPage){
                            Pair<Page, Long> currentPair = (Pair<Page, Long>)obj;
                            Pair<String, Integer> currentPID = currentPair.first.getPID();
                            if(currentPID.first.equals(PID.first) && currentPID.second.equals(PID.second)){
                                toRemove.add(currentPID);
                                numberOfPages.decrementAndGet();
                            }
                        }
                        listPage.removeAll(toRemove);
                    }

                } catch (Exception e) {
                    page.setDirty(precDirty);
                }
            }
        });
    }

    public void UnloadAllPages(){
            for (List list : pages) {
                synchronized (list) {
                    for (Object obj : list) {
                        Pair<Page, Long> pair = (Pair<Page, Long>) obj;
                        UnloadPage(pair);
                    }
                }
            }
    }

    private void fetchPendingPages(){
        int size = 0;
        for (Pair<Table,Pair<Integer, Integer>> p: sequencesOfPages) {
            assert p != null;
            for(int i = p.second.first; i<= p.second.second; i++) {
                size += 16 * 1024;
                if (size < maxSizePages - (16 * 1024)) {
                    p.second.first += 1;
                    asyncLoadPage(p.first.getName(), i, p.first.getSessionID());
                } else {
                    break;
                }
            }
            sequencesOfPages.remove(p);
            if (size < maxSizePages - (16 * 1024)) {break;}
        }
    }

    private Page findPagesInMemory(String tableName, int IDPage, Long sessionID){
        List<Pair<Page, Long>> pageList = getListPage(IDPage);
        synchronized (pageList){
            for(Object obj: pageList){
                Pair<Page, Long> pair = (Pair<Page, Long>)obj;
                Page p = pair.first;
                if(p.getPID().first.equalsIgnoreCase(tableName) && p.getPID().second == IDPage
                        && (sessionID == null || sessionID.equals(p.getSessionID()))){
                    pair.second = System.currentTimeMillis();
                    return p;
                }
            }
        }
        return  null;
    }

    private Pair<Page, Long> findLRU(){
        Pair<Page, Long> LRU = null;
        for(List list: pages) {
            for (Object obj : list) {
                Pair<Page, Long> pair = (Pair<Page, Long>) obj;
                if (LRU != null && pair.second < LRU.second) {
                    LRU = pair;
                } else LRU = pair;
            }
        }
        return LRU;
    }

    void waitTermination(int timeout, TimeUnit timeUnit){
        boolean waited = false;
        while(IO_pool.getQueue().size()>0) {
            try {
                //if(((ThreadPoolExecutor) IO_pool).getActiveCount() > 0){
                if(IO_pool.getQueue().size()>0){
                    waited = IO_pool.awaitTermination(timeout, timeUnit);
                }
                //}else break;
            } catch (Exception e){}
        }
    }

    void deleteSessionTuples(Long sessionID){
        assert sessionID != null;
        for (List<Pair<Page, Long>> list: pages) {
            synchronized (list) {
                List<Pair<Page, Long>> toRemove = new ArrayList<>();
                for (int i = 0; i < list.size(); i++) {
                    Pair<Page, Long> pair = list.get(i);
                    synchronized (pair) {
                        Page page = pair.first;
                        synchronized (page) {
                            if (sessionID.equals(page.getSessionID())) {
                                toRemove.add(pair);
                            }
                        }
                    }
                }
                list.removeAll(toRemove);
            }
        }

        numberOfPages.set(calculateNumberPages());

        synchronized (pendingPages){
            pendingPages.removeAll(pendingPages);
        }
    }

    void shutDown(){
        UnloadAllPages();
        IO_pool.shutdown();
        waitTermination(1, TimeUnit.MINUTES);
    }

    void UnloadAndWaitTermination(){
        UnloadAllPages();
        waitTermination(1, TimeUnit.SECONDS);
    }

    public int calculateNumberPages(){
        int i = 0;
        synchronized (pages) {
            for (List<Pair<Page, Long>> list : pages) {
                synchronized (list) {
                    for (Pair<Page, Long> pair : list) {
                        i++;
                    }
                }
            }
        }
        return i;
    }

}
