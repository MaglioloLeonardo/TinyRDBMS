package com.basePackage.LogicLayer.WhereClauseTree;
import com.basePackage.LogicLayer.WhereClauseTree.Interfaces.BooleanNode;
import com.basePackage.LogicLayer.WhereClauseTree.Interfaces.NodeField;
import com.basePackage.LogicLayer.WhereClauseTree.Interfaces.WhereTreeNode;

public class OrderBooleanNode implements WhereTreeNode, BooleanNode {
    private Operators.OrderBooleanOp operator;
    private NodeField leftNode, rightNode;

    public OrderBooleanNode(NodeField leftNode, NodeField rightNode, Operators.OrderBooleanOp operator){
        assert leftNode != null && rightNode != null && operator != null;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.operator = operator;
    }

    @Override
    public Boolean getResult() throws InvalidTypesException{
        boolean toReturn = false;
        try {
            toReturn = (leftNode.getResult()).compare(operator, rightNode.getResult());
        }catch (Exception e){
            throw new InvalidTypesException(this);
        }
        return toReturn;
    }

    public String toString(){
        try{
            return "<" + leftNode.getResult().toString() + " " + operator.toString() +  " " + rightNode.getResult().toString() + ">";
        }catch (InvalidTypesException e){
            return "<" + leftNode.toString() + " " + operator.toString() +  " " + rightNode.toString() + ">";
        }
    }
}
