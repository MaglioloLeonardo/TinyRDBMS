package com.basePackage.LogicLayer.WhereClauseTree;

import com.basePackage.LogicLayer.WhereClauseTree.Interfaces.BooleanNode;
import com.basePackage.LogicLayer.WhereClauseTree.Interfaces.WhereTreeNode;

public class UnaryBooleanNode implements WhereTreeNode, BooleanNode {
    private Operators.UnaryBooleanOp operator;
    private BooleanNode node;
    boolean leafValue = false;

    public UnaryBooleanNode(BooleanNode node, Operators.UnaryBooleanOp operator) throws InvalidTypesException {
        assert node != null;
        if(operator == Operators.UnaryBooleanOp.LEAF){
            throw new InvalidTypesException(this);
        }
        this.operator = operator;
        this.node = node;
    }

    public UnaryBooleanNode(boolean value, Operators.UnaryBooleanOp operator) throws InvalidTypesException {
        if(operator != Operators.UnaryBooleanOp.LEAF){
            throw new InvalidTypesException(this);
        }
        this.leafValue = value;
        this.operator = operator;
    }

    @Override
    public Boolean getResult() throws InvalidTypesException{
        switch (operator){
            case NOT:
                return !node.getResult();
            case LEAF:
                return leafValue;
        }
        return false;
    }

    public String toString(){
        try {
            return "<"+operator.toString() +  " " + node.getResult().toString() + ">";
        }catch (InvalidTypesException e){
            return "<"+operator.toString() +  " " + node.toString() + ">";
        }
    }
}
