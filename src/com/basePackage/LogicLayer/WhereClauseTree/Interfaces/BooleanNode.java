package com.basePackage.LogicLayer.WhereClauseTree.Interfaces;

import com.basePackage.LogicLayer.WhereClauseTree.InvalidTypesException;

public interface BooleanNode extends WhereTreeNode{
    public Boolean getResult() throws InvalidTypesException;
}
