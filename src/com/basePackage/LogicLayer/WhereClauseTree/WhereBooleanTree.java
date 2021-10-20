package com.basePackage.LogicLayer.WhereClauseTree;

import com.basePackage.LogicLayer.WhereClauseTree.Interfaces.BooleanNode;

import java.util.List;

public class WhereBooleanTree {
    BooleanNode head;
    List<LeafFieldNode> leaves;

    public WhereBooleanTree(BooleanNode head, List<LeafFieldNode> leaves){
        this.head = head;
        this.leaves = leaves;
    }

    public List<LeafFieldNode> getLeaves(){
        return leaves;
    }

    public boolean evaluate() throws InvalidTypesException{
        return head.getResult();
    }
}
