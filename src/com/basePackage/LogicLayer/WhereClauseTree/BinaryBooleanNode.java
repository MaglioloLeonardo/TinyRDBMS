package com.basePackage.LogicLayer.WhereClauseTree;


import com.basePackage.LogicLayer.WhereClauseTree.Interfaces.BooleanNode;
import com.basePackage.LogicLayer.WhereClauseTree.Interfaces.WhereTreeNode;

public class BinaryBooleanNode implements WhereTreeNode, BooleanNode {
    private Operators.BinaryBooleanOp operator;
    private BooleanNode leftNode, rightNode;

    public BinaryBooleanNode(BooleanNode leftNode, BooleanNode rightNode, Operators.BinaryBooleanOp operator){
        assert leftNode != null && rightNode != null && operator != null;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.operator = operator;
    }

    @Override
    public Boolean getResult() throws InvalidTypesException{
        switch (operator){
            case OR:
                return leftNode.getResult() || rightNode.getResult();
            case AND:
                return leftNode.getResult() && rightNode.getResult();
        }
        return false;
    }

    public String toString(){
        try{
            return "<" + leftNode.getResult().toString() + " " + operator.toString() +  " " + rightNode.getResult().toString() + ">";
        }catch (InvalidTypesException e){
            return "<" + leftNode.toString() + " " + operator.toString() +  " " + rightNode.toString() + ">";
        }
    }
}
