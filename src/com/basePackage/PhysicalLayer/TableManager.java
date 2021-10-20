package com.basePackage.PhysicalLayer;

import com.basePackage.ApplicationLayer.Settings;
import com.basePackage.PhysicalLayer.Exceptions.NotFoundedTableException;
import com.basePackage.PhysicalLayer.Exceptions.ReferencedTableException;


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableManager {
    private static TableManager currentInstance = null;
    private String DBPath = System.getProperty("user.dir") + Settings.relativeDbPath;
    private List<Table> tables = new ArrayList<Table>();
    private PageManager pageManager;

    public static TableManager getInstance(){
        if(currentInstance == null){
            currentInstance = new TableManager();
        }
        return currentInstance;
    }

    private TableManager(){
        this.pageManager = PageManager.getPageManager();
        FileUtility.clearSessions();
    }

    public Table getTable(String tableName){
        for(Table table: tables){
            if(table.getName().equalsIgnoreCase(tableName))return table;
        }
        if(FileUtility.existsTable(tableName)){
            Table toReturn = loadTable(tableName);
            tables.add(toReturn);
            return toReturn;
        }else return null;
    }

    public Table getTable(String tableName, long sessionID){
        for(Table table: tables){
            if(table.getName().equals(tableName) && table.getSessionID() != null &&  table.getSessionID().equals(sessionID))return table;
        }
        if(FileUtility.existsTable(tableName, sessionID)){
            Table toReturn = loadTable(tableName, sessionID);
            tables.add(toReturn);
            return toReturn;
        }else return null;
    }

    public boolean CreateTable(String name,TupleDesc tdesc){
        return CreateTable(name, tdesc, null);
    }

    public boolean CreateTable(String name,TupleDesc tdesc, Long sessionID){
        Table table = new Table(name, tdesc);
        if(sessionID != null)table.setSessionID(sessionID);
        File f = null;
        if(sessionID == null){
            new File(FileUtility.getPathTable(table));
        }else new File(FileUtility.getPathTable(table, sessionID));

        if(f==null || !f.exists()){
            unloadTable(table);
            return true;
        }else return false;
    }

    public boolean deleteTable(String nameTable) throws ReferencedTableException, NotFoundedTableException {
        Table thisTable = getTable(nameTable);

        if(thisTable == null){
            throw new NotFoundedTableException(nameTable);
        }

        if(thisTable.getReferencedTable().size() >= 1){
            throw new ReferencedTableException(thisTable);
        }

        for(String refersTo: thisTable.getRefersToTable()){
            Table tableRefersTo = getTable(refersTo);
            if(tableRefersTo != null)tableRefersTo.removeReferenceTable(thisTable.getName());
        }

        return deleteTable(thisTable);
    }

    public boolean deleteTable(Table table){
        tables.removeIf(this_table -> this_table == table);
        return FileUtility.deleteTableFolder(table);
    }

    public void shutDown(){
        unloadAllTables();
        pageManager.shutDown();
    }

    public void UnloadAndWaitTermination(){
        unloadAllTables();
        pageManager.UnloadAndWaitTermination();
    }

    public void unloadTable(Table table){
        synchronized (table) {
            try {
                if(table.getSessionID() == null){
                    FileUtility.saveTable(table);
                }else FileUtility.saveTable(table, table.getSessionID());
            } catch (Exception e){}
        }
        pageManager.UnloadAllPages();
    }

    public void unloadAllTables(){
        for(Table table: tables){
            unloadTable(table);
        }
        tables.removeAll(tables);
    }

    static public String getTablesName(){
        return FileUtility.getTablesName();
    }

    private Table loadTable(String tableName){
        Table toReturn =  FileUtility.readTable(FileUtility.getPathTable(tableName));
        assert toReturn != null;
        toReturn.setPageManager(pageManager);
        return toReturn;
    }

    private Table loadTable(String tableName, long sessionID){
        Table toReturn =  FileUtility.readTable(FileUtility.getPathTable(tableName, sessionID));
        assert toReturn != null;
        toReturn.setPageManager(pageManager);
        return toReturn;
    }

    public void createSession(long sessionID){
        FileUtility.createSession(sessionID);
    }

    public void deleteSession(Long sessionID) {
        if (existsSession(sessionID)) {
            pageManager.waitTermination(1, TimeUnit.SECONDS);
            boolean isDeleted = false;
            while (!isDeleted) {
                try {
                    isDeleted = FileUtility.deleteSession(sessionID);
                    Thread.sleep(10);
                } catch (Exception e) {
                }
            }
            List<Table> toRemove = new ArrayList<>();
            for (Table table : tables) {
                if (sessionID.equals(table.getSessionID())) {
                    toRemove.add(table);
                }
            }
            tables.removeAll(toRemove);
            pageManager.deleteSessionTuples(sessionID);
        }
    }

    public boolean existsSession(long sessionID){
        return FileUtility.existsSession(sessionID);
    }

}
