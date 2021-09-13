package com.basePackage.PhysicalLayer;

import com.basePackage.LogicLayer.FromClauseTree.TableLeafNode;
import com.basePackage.LogicLayer.WhereClauseTree.InvalidTypesException;
import com.basePackage.LogicLayer.WhereClauseTree.LeafFieldNode;
import com.basePackage.LogicLayer.WhereClauseTree.WhereBooleanTree;
import com.basePackage.PhysicalLayer.Exceptions.InvalidFieldException;
import com.basePackage.PhysicalLayer.Exceptions.InvalidKeyTupleException;
import com.basePackage.PhysicalLayer.Exceptions.InvalidTupleException;
import com.basePackage.PhysicalLayer.Exceptions.NotFoundedAttributeException;
import com.basePackage.UtilityLayer.Pair;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Page implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    public final static int MaxByteSize = 1024*16*10;
    private List<Tuple> tuples = new ArrayList<Tuple>();
    private TupleDesc tdesc;
    private Long sessionID = null;
    private boolean isDirty = false;
    private boolean isValid = true;
    private Pair<String, Integer> PID;

    public Page(TupleDesc tdesc, String tableName, int ID){
        this.tdesc = tdesc;
        PID = new Pair<String, Integer>(tableName, ID);
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public Long getSessionID() {
        return sessionID;
    }

    public void setSessionID(Long sessionID) {
        this.sessionID = sessionID;
    }

    public boolean isFull(){
        if(getByteSize() >= MaxByteSize){
            return true;
        }else return false;
    }

    public int getByteSize(){
        return tuples.size()*tdesc.getSize();
    }

    public Pair<String, Integer> getPID() {
        return PID;
    }

    public void setPID(Pair<String, Integer> PID) {
        this.PID = PID;
    }

    public synchronized boolean addTuple(Tuple t){
        //assert tdesc.equals(t.getTupleDesc());
        if((tuples.size()-1)*tdesc.getSize() <= MaxByteSize){
            setDirty(true);
            tuples.add(t);
            return true;
        }else return false;
    }

    public void removeTuplesWithCondition(WhereBooleanTree tree) throws NotFoundedAttributeException, InvalidTypesException {
        assert tree != null;
        List<Tuple> tuplesCopy = new ArrayList<>(tuples);
        synchronized (tuples) {
            for (int i = 0; i<tuplesCopy.size(); i++){
                Tuple t = tuplesCopy.get(i);
                synchronized (t) {
                    substituteTupleValueBooleanTree(tdesc, t, tree);
                    if (tree.evaluate()) {
                        removeTuple(t);
                    }
                }
            }
        }
    }

    public synchronized boolean removeTuple(Tuple t){
        boolean flag = false;
        List<Tuple> toRemove = new ArrayList<Tuple>();
        for (Tuple tuple: tuples){
            if(t.toString().equals(tuple.toString())){
                flag = true; setDirty(true);
                toRemove.add(tuple);
            }
        }
        tuples.removeAll(toRemove);
        return flag;
    }

    public int getIndexTuple(Tuple t){
        return tuples.indexOf(t);
    }

    public synchronized boolean removeIndexTuple(int i){
        if(tuples.remove(i) != null){
            setDirty(true);
            return true;
        }else return  false;
    }

    public String toString(WhereBooleanTree tree) throws InvalidTypesException, NotFoundedAttributeException {
        String toReturn = "";
        for(Tuple t: tuples){
            substituteTupleValueBooleanTree(tdesc, t, tree);
            if(tree.evaluate()) {
                toReturn += "\n" + t.toString();
            }
        }
        return toReturn;
    }

    public String toString(){
        String toReturn = "";
        for(Tuple t: tuples){
            toReturn += "\n" + t.toString();
        }
        return toReturn;
    }

    boolean existTupleWithValues(List<String> names, List<Field> values) throws NotFoundedAttributeException {
        assert names.size() == values.size();
        for(Tuple tuple: tuples) {
            boolean exists = true;
            for (int i = 0; i < names.size(); i++) {
                if(!tuple.getField(names.get(i)).equals(values.get(i))){
                    exists = false;
                }
            }
            if(exists){
                return true;
            }
        }
        return  false;
    }

    static void performJoin(Table table, Table leftTable, Page leftPage, Table rightTable, Page rightPage, WhereBooleanTree tree) throws NotFoundedAttributeException, InvalidTypesException, InvalidKeyTupleException, InvalidTupleException, InvalidFieldException {
        for(Tuple tupleLeft: leftPage.tuples){
            for(Tuple tupleRight: rightPage.tuples){
                substituteTupleValueBooleanTree(leftTable.getTupleDesc(), tupleLeft, rightTable.getTupleDesc(), tupleRight, tree);
                if(tree.evaluate()){
                    Tuple toAdd = new Tuple(table.getTupleDesc());
                    List<Field> fields = tupleLeft.getFields();
                    for(int i = 0; i < fields.size(); i++){
                        toAdd.setField(i, fields.get(i));
                    }
                    int prevLen = fields.size();
                    fields = tupleRight.getFields();
                    for(int i = prevLen; i < (fields.size()+prevLen); i++){
                        toAdd.setField(i, fields.get(i-prevLen));
                    }

                    table.addTuple(toAdd, false);
                }
            }
        }
    }

    private static void substituteTupleValueBooleanTree(TupleDesc tdesc, Tuple tuple, WhereBooleanTree tree) throws NotFoundedAttributeException {
        substituteTupleValueBooleanTree(tdesc, tuple, null, null, tree);
    }

    private static void substituteTupleValueBooleanTree(TupleDesc tdescLeft, Tuple tupleLeft, TupleDesc tdescRight, Tuple tupleRight, WhereBooleanTree tree) throws NotFoundedAttributeException {
        if (tree != null && tree.getLeaves().size() > 0) {
            List<String> namesLeft = tdescLeft.getAttrNames();
            List<String> namesRight = null;
            if(tdescRight != null){
                namesRight = tdescRight.getAttrNames();
            }
            if (tree != null) {
                for (LeafFieldNode leaf : tree.getLeaves()) {
                    boolean founded = false;
                    String nameLeaf = leaf.getName();
                    if (!leaf.getAlias().equals("")) {
                        nameLeaf = leaf.getAlias() + "." + nameLeaf;
                    }

                    for (int i = 0; i < namesLeft.size(); i++) {
                        if (namesLeft.get(i).equals(nameLeaf)) {
                            leaf.setField(tupleLeft.getField(i));
                            founded = true;
                            break;
                        }
                    }

                    if (!founded && namesRight != null) {
                        for (int i = 0; i < namesRight.size(); i++) {
                            if (namesRight.get(i).equals(nameLeaf)) {
                                leaf.setField(tupleRight.getField(i));
                                founded = true;
                                break;
                            }
                        }
                    }

                    if (!founded) {
                        throw new NotFoundedAttributeException(nameLeaf);
                    }
                }
            }
        }
    }


}
