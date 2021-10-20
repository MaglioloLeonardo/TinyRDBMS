package com.basePackage.LogicLayer.FromClauseTree;

import com.basePackage.LogicLayer.WhereClauseTree.InvalidTypesException;
import com.basePackage.PhysicalLayer.Exceptions.*;
import com.basePackage.PhysicalLayer.Table;

public interface FromClauseNode {
    public Table execute() throws RepeatedAttributeException1, InvalidKeyException, InvalidKeyTupleException, NotFoundedAttributeException, InvalidTypesException, InvalidTupleException, InvalidFieldException, RepeatedAttributeException, com.basePackage.PhysicalLayer.InvalidTupleException; //returns the table created after execution;
}
