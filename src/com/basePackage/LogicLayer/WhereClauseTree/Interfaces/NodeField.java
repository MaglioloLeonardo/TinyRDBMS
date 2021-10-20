package com.basePackage.LogicLayer.WhereClauseTree.Interfaces;
import com.basePackage.LogicLayer.WhereClauseTree.InvalidTypesException;
import com.basePackage.PhysicalLayer.Field;

public interface NodeField extends WhereTreeNode{
    public Field getResult() throws InvalidTypesException;
}
