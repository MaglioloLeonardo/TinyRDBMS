package com.basePackage.LogicLayer.FromClauseTree;

import com.basePackage.PhysicalLayer.Table;
import com.basePackage.PhysicalLayer.TableManager;

public class TableLeafNode implements FromClauseNode{
    Table table;
    String alias = "";
    long currentSession;

    public TableLeafNode(Table table, String alias, long currentSession){
        this.table = table;
        this.alias = alias;
        this.currentSession = currentSession;
    }

    @Override
    public Table execute() {
        //make actions, copy table with name alias.nametable in currentsesison folder
        //if alias is "" then name becomes nametable
        String newName = table.getName();
        if(!alias.equals("")){
            newName = alias;
        }
        table.copyAtSession(currentSession, newName);
        //get copied table from table manager and return it
        return TableManager.getInstance().getTable(newName, currentSession);
    }
}
