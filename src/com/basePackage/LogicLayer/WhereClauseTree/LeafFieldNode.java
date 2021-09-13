package com.basePackage.LogicLayer.WhereClauseTree;

import com.basePackage.LogicLayer.WhereClauseTree.Interfaces.NodeField;
import com.basePackage.LogicLayer.WhereClauseTree.Interfaces.WhereTreeNode;
import com.basePackage.PhysicalLayer.Field;

public class LeafFieldNode implements WhereTreeNode, NodeField {
    private String name;
    private Field field;
    private String alias = "";

    public LeafFieldNode(String name){

        this.field = field;
        this.name = name;
    }

    public void setField(Field field){
        this.field = field;
    }

    public String getName(){
        return name;
    }

    @Override
    public Field getResult() {
        return field;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String toString(){
        if(field == null){
            return  "";
        }else return field.toString();
    }
}
