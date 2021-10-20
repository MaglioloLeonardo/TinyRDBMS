package com.basePackage.PhysicalLayer;

import com.basePackage.ApplicationLayer.Settings;

import java.io.*;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class FileUtility {

    static Page readPage(String path){
        int i = 0, treshhold = 500;
        while (i<=treshhold){
            i++;
            Page toReturn = null;
            try{
                File file = new File(path);
                ObjectInputStream out = new ObjectInputStream(new FileInputStream(file));
                toReturn = (Page) out.readObject();
                out.close();
                return toReturn;
            }catch (Exception e){
                if(e instanceof FileNotFoundException){
                    return null;
                }
                if( i== treshhold){
                    System.out.println("Error: readPage was unable to catch the page at " + path);
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
            }
            try {
                TimeUnit.MILLISECONDS.sleep(10);
            }catch (Exception e){}
        }
        return null;
    }

    static boolean savePage(Page p){
        if(p.getSessionID() == null){
            return savePage(p, getPathPage(p));
        }else return savePage(p, getPathPage(p, p.getSessionID()));
    }

    static boolean savePage(Page p, String path){
        ObjectOutputStream out;
        synchronized (p) {
            try {
                File file = new File(path);
                //waitIfOpened(file);
                out = new ObjectOutputStream(new FileOutputStream(file));
                out.writeObject(p);
                out.close();
                return true;
            }catch (Exception e){
                System.out.println("Error: savePage was unable to save the page at " + path);
                e.printStackTrace();
            }
            return false;
        }
    }

    static String getPathPage(Page p){
        String path = System.getProperty("user.dir") + Settings.relativeDbPath + "\\";
        return path += p.getPID().first + "\\" + p.getPID().second;
    }

    static String getPathPage(Page p, long sessionID){
        String path = getPathSessionID(sessionID) + "\\";
        return path += p.getPID().first + "\\" + p.getPID().second;
    }

    static String getPathPage(String tableName, int ID){
        String path = System.getProperty("user.dir") + Settings.relativeDbPath + "\\";
        return path += tableName + "\\" + ID;
    }

    static String getPathPage(String tableName, int ID, Long sessionID){
        String path = getPathSessionID(sessionID) + "\\";
        return path += tableName + "\\" + ID;
    }
    //____________________________________________________________________________________________

    static Table readTable(String path){
        Table toReturn = null;
        try{
            File file = new File(path);
            ObjectInputStream out = new ObjectInputStream(new FileInputStream(file));
            toReturn = (Table) out.readObject();
            out.close();
        }catch (Exception e){
            System.out.println("Error: readTable was unable to catch the table at " + path);
            e.printStackTrace();
        }
        return  toReturn;
    }

    static boolean saveTable(Table t){
        return saveTable(t, getPathTable(t),getPathDirectoryTable(t));
    }

    static boolean saveTable(Table t, long sessionID){
        return saveTable(t, getPathTable(t, sessionID), getPathDirectoryTable(t, sessionID));
    }

    static boolean saveTable(Table t, String pathTable, String pathFolderTable) {
        ObjectOutputStream out;
        synchronized (t) {
            try {
                File directory = new File(pathFolderTable);
                if(!directory.exists())directory.mkdir();
                File file = new File(pathTable);
                //waitIfOpened(file);
                out = new ObjectOutputStream(new FileOutputStream(file));
                out.writeObject(t);
                out.close();
                return true;
            } catch (Exception e) {
                System.out.println("Error: saveTable was unable to save the page at " + pathTable);
                e.printStackTrace();
            }
            return false;
        }
    }


    static String getPathTable(Table t){
        String path = System.getProperty("user.dir") + Settings.relativeDbPath + "\\";
        return path += t.getName() + "\\" + t.getName();
    }

    static String getPathTable(Table t, long sessionID){
        String path = getPathSessionID(sessionID) + "\\";
        return path += t.getName() + "\\" + t.getName();
    }

    static String getPathTable(String tableName){
        String path = System.getProperty("user.dir") + Settings.relativeDbPath + "\\";
        return path += tableName + "\\" + tableName;
    }

    static String getPathTable(String tableName, long sessionID){
        String path = getPathSessionID(sessionID) + "\\";
        return path += tableName + "\\" + tableName;
    }

    static String getPathDirectoryTable(Table t){
        String path = System.getProperty("user.dir") + Settings.relativeDbPath + "\\";
        return path += t.getName();
    }

    static String getPathDirectoryTable(Table t, long sessionID){
        String path = getPathSessionID(sessionID) + "\\";
        return path += t.getName();
    }

    static String getPathDirectoryTable(String tableName){
        String path = System.getProperty("user.dir") + Settings.relativeDbPath + "\\";
        return path += tableName;
    }

    static String getPathDirectoryTable(String tableName, long sessionID){
        String path = getPathSessionID(sessionID) + "\\";
        return path += tableName;
    }

    static String getPathSessionID(long sessionID){
        return System.getProperty("user.dir") + Settings.relativeDbPath + "\\TempSessions\\" + sessionID;
    }

    static boolean deleteTableFolder(Table t){
        File file = new File(getPathDirectoryTable(t));
        return deleteDirectory(file);
    }

    static boolean deleteTableFolder(String tableName){
        if(tableName.equals("TempSessions")){
            return false;
        }
        File file = new File(getPathDirectoryTable(tableName));
        return deleteDirectory(file);
    }

    static  private boolean deleteDirectory(File directoryToBeDeleted) {
        File[] allContents = directoryToBeDeleted.listFiles();
        if (allContents != null) {
            for (File file : allContents) {
                deleteDirectory(file);
            }
        }
        return directoryToBeDeleted.delete();
    }

    static public boolean existsTable(Table t){
        File table = new File(getPathTable(t));
        return table.exists();
    }

    static public boolean existsTable(String nameTable){
        File table = new File(getPathTable(nameTable));
        return table.exists();
    }

    static public boolean existsTable(String nameTable, long sessionID){
        File table = new File(getPathTable(nameTable, sessionID));
        return table.exists();
    }

    static public String getTablesName(){
        String result = "[";
        String path = System.getProperty("user.dir") + Settings.relativeDbPath + "\\";
        File[] files = new File(path).listFiles();

        for (int i = 0; i< Objects.requireNonNull(files).length; i++) {
            if (files[i].isDirectory() && !files[i].getName().equals("TempSessions")) {
                if(i > 0){
                    result += ", ";
                }
                result += files[i].getName();
            }
        }
        return result + "]";
    }

    //Sessions-----------------------------
    static public void clearSessions(){
        File sessions = new File(System.getProperty("user.dir") + Settings.relativeDbPath + "\\TempSessions");
        deleteDirectory(sessions);
        if(!sessions.exists())sessions.mkdir();
    }

    static public void createSession(long sessionID){
        File directory = new File(getPathSessionID(sessionID));
        if(!directory.exists())directory.mkdir();
    }

    static boolean deleteSession(long sessionID){
        File file = new File(getPathSessionID(sessionID));
        return  deleteDirectory(file);
    }

    static public boolean existsSession(long sessionID){
        File session = new File(getPathSessionID(sessionID));
        return session.exists();
    }

    public static boolean copyTableInSession(String tableName, long sessionID, String newTableName){
        String newPath = getPathSessionID(sessionID)+"\\"+newTableName;
        File newDirectory = new File(getPathSessionID(sessionID)+"\\"+newTableName);
        if(!newDirectory.exists()){
            newDirectory.mkdir();
        }else return false;
        copyDir(getPathDirectoryTable(tableName), newPath, true);
        File tableFile = new File(newPath+"\\"+tableName);
        tableFile.renameTo(new File(newPath+"\\"+newTableName));
        //Non basta, bisogna cambiare il nome della tabella da dentro il file per mezzo della serializzazione
        Table tableToRename = readTable(getPathTable(newTableName, sessionID));
        tableToRename.setName(newTableName);
        tableToRename.setSessionID(sessionID);
        saveTable(tableToRename, sessionID);
        return true;
    }

    private static boolean copyDir(String src, String dest, boolean overwrite) {
        try {
            Files.walk(Paths.get(src)).forEach(a -> {
                Path b = Paths.get(dest, a.toString().substring(src.length()));
                try {
                    if (!a.toString().equals(src))
                        Files.copy(a, b, overwrite ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[]{});
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            return false;
        }
        return true;
    }
    //-------------------------------------


}


