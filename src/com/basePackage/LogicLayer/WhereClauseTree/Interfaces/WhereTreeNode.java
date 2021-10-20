package com.basePackage.LogicLayer.WhereClauseTree.Interfaces;

import com.basePackage.LogicLayer.WhereClauseTree.InvalidTypesException;

import java.io.InvalidObjectException;

public interface WhereTreeNode {
    public Object getResult() throws InvalidTypesException;
}
