package com.basePackage.LogicLayer.WhereClauseTree;

import com.basePackage.LogicLayer.WhereClauseTree.Interfaces.NodeField;
import com.basePackage.LogicLayer.WhereClauseTree.Interfaces.WhereTreeNode;
import com.basePackage.PhysicalLayer.Field;

public class ArithmeticFieldNode implements WhereTreeNode, NodeField {
    private Operators.ArithmeticOp operator;
    private NodeField leftNode, rightNode;

    public ArithmeticFieldNode(NodeField leftNode, NodeField rightNode, Operators.ArithmeticOp operator){
        assert leftNode != null && rightNode != null && operator != null;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.operator = operator;
    }

    @Override
    public Field getResult() throws InvalidTypesException {
        Field toReturn = null;
        try {
            toReturn = (leftNode.getResult()).arithmetic(operator, rightNode.getResult());
        }catch (Exception e){
            throw new InvalidTypesException(this);
        }
        return toReturn;
    }

    @Override
    public String toString(){
        try{
            return "<" + leftNode.getResult().toString() + " " + operator.toString() +  " " + rightNode.getResult().toString() + ">";
        }catch (InvalidTypesException e){
            return "<" + leftNode.toString() + " " + operator.toString() +  " " + rightNode.toString() + ">";
        }
    }
}
