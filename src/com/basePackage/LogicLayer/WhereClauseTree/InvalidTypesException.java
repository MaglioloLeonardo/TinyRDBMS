package com.basePackage.LogicLayer.WhereClauseTree;

import com.basePackage.LogicLayer.WhereClauseTree.Interfaces.WhereTreeNode;

public class InvalidTypesException extends Exception {
    String message;

    public InvalidTypesException(WhereTreeNode node){
        this.message = "The following operation is not valid:" + node.toString();
    }

    @Override
    public String toString() {
        return message;
    }
}
