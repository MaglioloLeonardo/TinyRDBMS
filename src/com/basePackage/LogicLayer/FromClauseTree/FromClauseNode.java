package com.basePackage.LogicLayer.FromClauseTree;

import com.basePackage.LogicLayer.WhereClauseTree.InvalidTypesException;
import com.basePackage.PhysicalLayer.Exceptions.*;
import com.basePackage.PhysicalLayer.Table;

public interface FromClauseNode {
    public Table execute() throws RepeatedAttributeException, InvalidKeyException, InvalidKeyTupleException, NotFoundedAttributeException, InvalidTypesException, InvalidTupleException, InvalidFieldException; //returns the table created after execution;
}
