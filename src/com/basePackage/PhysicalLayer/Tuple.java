package com.basePackage.PhysicalLayer;

import com.basePackage.PhysicalLayer.Exceptions.InvalidFieldException;
import com.basePackage.PhysicalLayer.Exceptions.NotFoundedAttributeException;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Tuple maintains information about the contents of a tuple. Tuples have a
 * specified schema specified by a TupleDesc object and contain Field objects
 * with the data for each field.
 */
public class Tuple implements Serializable {

    private static final long serialVersionUID = 1L;

    private RecordId rid;
    private Field fields[];
    private TupleDesc td;

    /**
     * Create a new tuple with the specified schema (type).
     * 
     * @param td
     *            the schema of this tuple. It must be a valid TupleDesc
     *            instance with at least one field.
     */
    public Tuple(TupleDesc td) {
        assert td != null;
        fields = new Field[td.numFields()];
        this.td = td;
    }

    /**
     * @return The TupleDesc representing the schema of this tuple.
     */
    public TupleDesc getTupleDesc() {
        return td;
    }

    /**
     * @return The RecordId representing the location of this tuple on disk. May
     *         be null.
     */
    public RecordId getRecordId() {
        return rid;
    }

    /**
     * Set the RecordId information for this tuple.
     * 
     * @param rid
     *            the new RecordId for this tuple.
     */
    public void setRecordId(RecordId rid) {
        this.rid = rid;
    }

    /**
     * Change the value of the ith field of this tuple.
     * 
     * @param i
     *            index of the field to change. It must be a valid index.
     * @param f
     *            new value for the field.
     */
    public void setField(int i, Field f) throws InvalidFieldException {
        if ((f.getType() != td.getFieldType(i)) && !(td.getFieldNullable(i) && f instanceof NullField)){
            throw new InvalidFieldException(td.getFieldName(i), f.toString());
        }
        fields[i] = f;
    }

    public void setField(String name, Field f) throws InvalidFieldException, NotFoundedAttributeException {
        setField(td.fieldNameToIndex(name), f);
    }

    /**
     * @return the value of the ith field, or null if it has not been set.
     * 
     * @param i
     *            field index to return. Must be a valid index.
     */
    public Field getField(int i) {
        return fields[i];
    }

    public Field getField(String name) throws NotFoundedAttributeException {
        return fields[td.fieldNameToIndex(name)];
    }

    public List<Field> getFields(){
        return Arrays.asList(fields);
    }

    public List<Field> getPKFieds(){
        List<Field> toReturn = new ArrayList<>();
        for(Integer i: td.getPKIndex()){
            toReturn.add(fields[i]);
        }
        return toReturn;
    }
    /**
     * Returns the contents of this Tuple as a string. Note that to pass the
     * system tests, the format needs to be as follows:
     * 
     * column1\tcolumn2\tcolumn3\t...\tcolumnN\n
     * 
     * where \t is any whitespace, except newline, and \n is a newline
     */

    public String toStringFirstKeys() {
        String s = "";
        List<Integer> pkIndexs =td.getPKIndex();

        for(Integer itemPkIndex: pkIndexs){
            s += fields[itemPkIndex] + " ";
        }

        for (int i = 0; i < fields.length; i++) {
            boolean isFound = false;
            for(Integer pkIndex: pkIndexs){
                if(pkIndex == i){
                    isFound = true;
                    break;
                }
            }
            if(!isFound) {
                s += fields[i] + " ";
            }
        }
        return s;
    }

    public String toString(){
        String s = "";
        for(Field field: fields){
            s += field.toString() + " ";
        }
        return  s;
    }



    /**
     * @return
     *        An iterator which iterates over all the fields of this tuple
     * */
    public Iterator<Field> fields()
    {
        return Arrays.asList(fields).iterator();
    }
    
    /**
     * reset the TupleDesc of thi tuple
     * */
    public void resetTupleDesc(TupleDesc td)
    {
        this.td = td;
    }
}
