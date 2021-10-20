package com.basePackage.LogicLayer.WhereClauseTree;

import com.basePackage.LogicLayer.WhereClauseTree.Interfaces.BooleanNode;
import com.basePackage.LogicLayer.WhereClauseTree.Interfaces.NodeField;
import com.basePackage.LogicLayer.WhereClauseTree.Interfaces.WhereTreeNode;
import com.basePackage.PhysicalLayer.NullField;

public class NullOperatorNode  implements WhereTreeNode, BooleanNode {
    private Operators.NullOp operator;
    private NodeField node;

    public NullOperatorNode(Operators.NullOp op, NodeField node){
        this.operator = op;
        this.node = node;
    }

    @Override
    public Boolean getResult() throws InvalidTypesException {
        switch (operator){
            case ISNULL:
                return node.getResult() instanceof NullField;
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
