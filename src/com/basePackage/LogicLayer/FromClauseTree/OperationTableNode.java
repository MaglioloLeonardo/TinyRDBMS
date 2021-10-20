package com.basePackage.LogicLayer.FromClauseTree;

import com.basePackage.LogicLayer.WhereClauseTree.InvalidTypesException;
import com.basePackage.LogicLayer.WhereClauseTree.WhereBooleanTree;
import com.basePackage.PhysicalLayer.Exceptions.*;
import com.basePackage.PhysicalLayer.Table;
import com.basePackage.PhysicalLayer.TableManager;
import com.basePackage.PhysicalLayer.TupleDesc;

import java.util.ArrayList;
import java.util.List;

public class OperationTableNode implements FromClauseNode{
    private static int name = 0;
    public enum Op{CARTESIAN_PRODUCT , JOIN}

    FromClauseNode leftNode, rightNode;
    Op operator;
    long currentSession;
    WhereBooleanTree constraint = null;

    public OperationTableNode(FromClauseNode leftNode, FromClauseNode rightNode, Op operator, long currentSession){
        assert leftNode != null && rightNode != null;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.operator = operator;
        this.currentSession = currentSession;
    }

    public void setConstraint(WhereBooleanTree constraint){
        if(operator == Op.JOIN){
            this.constraint = constraint;
        }
    }

    @Override
    public Table execute() throws RepeatedAttributeException, InvalidKeyException, InvalidKeyTupleException, NotFoundedAttributeException, InvalidTypesException, InvalidTupleException, InvalidFieldException, RepeatedAttributeException1, com.basePackage.PhysicalLayer.InvalidTupleException {
        Table leftTable = leftNode.execute();
        Table rightTable = rightNode.execute();
        assert leftTable != null && rightTable != null;
        TupleDesc mergeTupleDesc = TupleDesc.merge(adjustNamesTupleDesc(leftTable, leftNode),
                adjustNamesTupleDesc(rightTable, rightNode), false);
        //String tableName = "("+leftTable.getName()+"_"+operator+"_"+rightTable.getName()+")";
        String tableName = "TempTable"+Integer.toString(OperationTableNode.name);
        OperationTableNode.name++;
        TableManager.getInstance().CreateTable(tableName, mergeTupleDesc, currentSession);
        Table toReturn = TableManager.getInstance().getTable(tableName, currentSession);
        switch(operator){
            case CARTESIAN_PRODUCT:
                toReturn.performCartesianProduct(leftTable, rightTable);
                break;
            case JOIN:
                assert constraint != null;
                toReturn.performJoin(leftTable, rightTable, constraint);
                break;
        }
        //System.out.println(toReturn);
        return toReturn;
    }

    private TupleDesc adjustNamesTupleDesc(Table table, FromClauseNode node){
        TupleDesc toReturn = new TupleDesc(table.getTupleDesc());
        if(!(node instanceof TableLeafNode)){
            return toReturn;
        }
        String aliasTable = ((TableLeafNode)node).alias;
        if(!aliasTable.equals("")){
            List<String> prevNames = toReturn.getAttrNames();
            List<String> newNames = new ArrayList<>();
            for(String nameAttr: prevNames){
                newNames.add(aliasTable + "." + nameAttr);
            }
            toReturn.changeNames(newNames);
        }
        return toReturn;
    }
}
