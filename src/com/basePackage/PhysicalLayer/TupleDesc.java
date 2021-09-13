package com.basePackage.PhysicalLayer;

import com.basePackage.PhysicalLayer.Exceptions.InvalidKeyException;
import com.basePackage.PhysicalLayer.Exceptions.NotFoundedAttributeException;
import com.basePackage.PhysicalLayer.Exceptions.RepeatedAttributeException;
import org.antlr.v4.runtime.misc.Pair;

import java.io.Serial;
import java.io.Serializable;
import java.util.*;

/**
 * TupleDesc describes the schema of a tuple.
 */
public class TupleDesc implements Serializable {
    private int size = 0;
    /**
     * A help class to facilitate organizing the information of each field
     * */
    public static class TDItem implements Serializable {

        @Serial
        private static final long serialVersionUID = 1L;

        /**
         * The type of the field
         * */
        public Type fieldType;
        public Boolean nullable = false;
        public String referenceTable = null;
        public String attrNameReferenceTable = null;

        /**
         * The name of the field
         * */
        public String fieldName;

        public TDItem(Type t, String n) {
            this.fieldName = n;
            this.fieldType = t;
        }

        public TDItem(Type t, String n, Boolean nullable) {
            this(t, n);
            this.nullable = nullable;
        }

        public String toString() {
            String toReturn = "";
            if(!nullable){
                toReturn += "+";
            }
            toReturn += fieldName + "(" + fieldType + ")";
            if(referenceTable != null){
                toReturn += "-FK:<" + referenceTable + ","+ attrNameReferenceTable + ">";
            }
            return toReturn;
        }
    }

    /**
     * @return
     *        An iterator which iterates over all the field TDItems
     *        that are included in this TupleDesc
     * */
    public Iterator<TDItem> iterator() {
        return Arrays.asList(this.tdItems).iterator();
    }

    private static final long serialVersionUID = 1L;

    private final TDItem[] tdItems;
    private TDItem[] pkItems = new TDItem[1];

    /**
     * Create a new TupleDesc with typeAr.length fields with fields of the
     * specified types, with associated named fields.
     * 
     * @param typeAr
     *            array specifying the number of and types of fields in this
     *            TupleDesc. It must contain at least one entry.
     * @param fieldAr
     *            array specifying the names of the fields. Note that names may
     *            be null.
     */

    public TupleDesc(Type[] typeAr, String[] fieldAr, Boolean[] nullableAr, boolean mustPresentValidKey) throws RepeatedAttributeException, InvalidKeyException {
        assert typeAr.length == fieldAr.length;
        assert nullableAr == null || nullableAr.length == fieldAr.length;

        if(nullableAr == null){
            nullableAr = new Boolean[fieldAr.length];
            for(int i = 0; i<nullableAr.length; i++){
                nullableAr[i] = true;
            }
        }

        //controllo che non esistano coppie di attributi con lo stesso nome
        tdItems = new TDItem[typeAr.length];
        for (int i = 0; i < typeAr.length; i++) {
            assert typeAr[i] != null;
            for(int j = 0; j < typeAr.length; j++){
                assert fieldAr[j] != null;
                if(fieldAr[i] == fieldAr[j] && i != j)throw new RepeatedAttributeException(fieldAr[i]);
            }
            tdItems[i] = new TDItem(typeAr[i], fieldAr[i]);
            size += tdItems[i].fieldType.getLen();
        }

        List<TDItem> nonNullableItems = new ArrayList<>();
        for (int i = 0; i < nullableAr.length; i++) {
            tdItems[i].nullable = nullableAr[i];
            if(!nullableAr[i]){
                nonNullableItems.add(tdItems[i]);
            }
        }
        if(nonNullableItems.size() < 1 && mustPresentValidKey){
            throw new InvalidKeyException();
        }else pkItems = nonNullableItems.toArray(TDItem[]::new);
    }

    public TupleDesc(Type[] typeAr, String[] fieldAr, Boolean[] nullableAr) throws RepeatedAttributeException, InvalidKeyException {
        this(typeAr, fieldAr, nullableAr, true);
    }

    public TupleDesc(TupleDesc tdesc){
        this.tdItems = Arrays.copyOf(tdesc.tdItems, tdesc.tdItems.length);
        this.pkItems = Arrays.copyOf(tdesc.pkItems, tdesc.pkItems.length);
    }

    /**
     * @return the number of fields in this TupleDesc
     */
    public int numFields() {
        return tdItems.length;
    }

    /**
     * Gets the (possibly null) field name of the ith field of this TupleDesc.
     * 
     * @param i
     *            index of the field name to return. It must be a valid index.
     * @return the name of the ith field
     * @throws NoSuchElementException
     *             if i is not a valid field reference.
     */
    public String getFieldName(int i) throws NoSuchElementException {
        return tdItems[i].fieldName;
    }

    public List<String> getFieldNames(){
        List<String> toReturn = new ArrayList<>();
        for(TDItem tdItem: tdItems){
            toReturn.add(tdItem.fieldName);
        }
        return toReturn;
    }

    /**
     * Gets the type of the ith field of this TupleDesc.
     * 
     * @param i
     *            The index of the field to get the type of. It must be a valid
     *            index.
     * @return the type of the ith field
     * @throws NoSuchElementException
     *             if i is not a valid field reference.
     */
    public Type getFieldType(int i) throws NoSuchElementException {
        return tdItems[i].fieldType;
    }


    public boolean getFieldNullable(int i){
        return tdItems[i].nullable;
    }

    /**
     * Find the index of the field with a given name.
     * 
     * @param name
     *            name of the field.
     * @return the index of the field that is first to have the given name.
     * @throws NoSuchElementException
     *             if no field with a matching name is found.
     */
    public int fieldNameToIndex(String name) throws NoSuchElementException, NotFoundedAttributeException {
        for (int i = 0; i < numFields(); i++) {
            if (tdItems[i].fieldName != null
                    && tdItems[i].fieldName.equals(name))
                return i;
        }
        throw new NotFoundedAttributeException(name);
    }

    /**
     * @return The size (in bytes) of tuples corresponding to this TupleDesc.
     *         Note that tuples from a given TupleDesc are of a fixed size.
     */
    public int getSize() {
        /*int size = 0;
        for (int i = 0; i < tdItems.length; i++)
            size += tdItems[i].fieldType.getLen();*/
        return size;
    }

    /**
     * Merge two TupleDescs into one, with td1.numFields + td2.numFields fields,
     * with the first td1.numFields coming from td1 and the remaining from td2.
     * 
     * @param td1
     *            The TupleDesc with the first fields of the new TupleDesc
     * @param td2
     *            The TupleDesc with the last fields of the TupleDesc
     * @return the new TupleDesc
     */
    public static TupleDesc merge(TupleDesc td1, TupleDesc td2, boolean mergeKeys) throws RepeatedAttributeException, InvalidKeyException {
        if(td2 == null)return new TupleDesc(td1);
        if(td1 == null)return new TupleDesc(td2);
        Type[] types = new Type[td1.numFields() + td2.numFields()];
        String[] names = new String[types.length];
        Boolean[] nullable = new Boolean[types.length];
        List<String> pk = new ArrayList<>();

        List<TDItem> intersection = td1.getIntersection(td2);
        if(intersection.size() > 0){
            throw new RepeatedAttributeException(intersection.toString());
        }

        for (int i = 0; i < td1.numFields(); i++) {
            types[i] = td1.getFieldType(i);
            names[i] =  td1.getFieldName(i);
            nullable[i] = td1.getFieldNullable(i);
        }
        for (int i = 0; i < td2.numFields(); i++) {
            types[td1.numFields() + i] = td2.getFieldType(i);
            names[i+td1.numFields()]=    td2.getFieldName(i);
            nullable[i+td1.numFields()] = td2.getFieldNullable(i);
        }

        pk.addAll(td1.getPKNames()); pk.addAll(td2.getPKNames());

        TupleDesc toReturn =  new TupleDesc(types, names, nullable, false);
        if(mergeKeys)toReturn.setKey(pk.toArray(String[]::new));

        for (int i = 0; i < td1.numFields(); i++) {
            toReturn.addReferenceTo(td1.tdItems[i].referenceTable,td1.tdItems[i].attrNameReferenceTable, i);

        }

        for (int i = 0; i < td2.numFields(); i++) {
            toReturn.addReferenceTo(td2.tdItems[i].referenceTable,td2.tdItems[i].attrNameReferenceTable, i+td1.numFields());
        }

        return toReturn;
    }

    public static TupleDesc merge(TupleDesc td1, TupleDesc td2) throws RepeatedAttributeException, InvalidKeyException {
        return merge(td1, td2, true);
    }

    public TupleDesc subset(List<String> nameFields, String nameTable) throws RepeatedAttributeException, InvalidKeyException, NotFoundedAttributeException {
        Type[] typeFields = new Type[nameFields.size()];
        Boolean[] nullableFields = new Boolean[nameFields.size()];
        int j = 0;
        for(String nameField: nameFields){
            boolean isFound = false;
            for(int i = 0; i < tdItems.length ; i++){
                if(tdItems[i].fieldName.equals(nameField)){
                    isFound = true;
                    typeFields[j] = tdItems[i].fieldType;
                    nullableFields[j] = tdItems[i].nullable;
                    j++;
                }
            }

            if(!isFound){
                throw new NotFoundedAttributeException(nameField, nameTable);
            }
        }
        return new TupleDesc(typeFields, nameFields.toArray(String[]::new), nullableFields, false);
    }

    public void changeNames(List<String> fieldNames){
        assert tdItems.length == fieldNames.size();
        for(int i = 0; i<tdItems.length; i++){
            tdItems[i].fieldName = fieldNames.get(i);
        }
    }

    public void addReferenceTo(String tableName, String nameAttr,  int pos){
        assert pos <= tdItems.length;
        tdItems[pos].referenceTable = tableName;
        tdItems[pos].attrNameReferenceTable = nameAttr;
    }

    /**
     * Compares the specified object with this TupleDesc for equality. Two
     * TupleDescs are considered equal if they are the same size and if the n-th
     * type in this TupleDesc is equal to the n-th type in td.
     * 
     * @param o
     *            the Object to be compared for equality with this TupleDesc.
     * @return true if the object is equal to this TupleDesc.
     */
    public boolean equals(Object o) {
        if (!(o instanceof TupleDesc))
            return false;
        TupleDesc td = (TupleDesc) o;

        if (this.tdItems.length != td.tdItems.length)
            return false;
        for (int i = 0; i < tdItems.length; i++) {
            if (!tdItems[i].fieldType.equals(td.tdItems[i].fieldType))
                return false;
            if (!tdItems[i].fieldName.equals(td.tdItems[i].fieldName))
                return false;
        }
        return true;
    }

    public int hashCode() {
        // If you want to use TupleDesc as keys for HashMap, implement this so
        // that equal objects have equals hashCode() results
        throw new UnsupportedOperationException("unimplemented");
    }

    public void setKey(String[] fieldAr) throws InvalidKeyException {
        TDItem[] newPk = new TDItem[fieldAr.length];
        for(int i = 0; i < newPk.length; i++){
            boolean finded = false;
            for(int j = 0; j < tdItems.length; j++) {
                if (tdItems[j].fieldName.equals(fieldAr[i])) {
                    if(tdItems[j].nullable){
                        throw new InvalidKeyException(); //pk member must be not nullable
                    }
                    finded = true;
                    newPk[i] = tdItems[j];
                }
            }
            if(!finded){
                throw new InvalidKeyException();
            }
        }
        pkItems = newPk;
    }

    public void setNullable(List<String> attrNames){
        for(String name: attrNames){
            for(int i = 0; i < tdItems.length; i++){
                if(tdItems[i].fieldName.equals(name)){
                    tdItems[i].nullable = true;
                }
            }
        }
    }

    public List<String> getNotNullableItems(){
        List<String> toReturn = new ArrayList<>();
        for(int i = 0; i < tdItems.length; i++){
            if(!tdItems[i].nullable){
                toReturn.add(tdItems[i].fieldName);
            }
        }
        return toReturn;
    }

    public void setAllAttributesNullableValue(boolean value){
        for(TDItem column: tdItems){
            column.nullable = value;
        }
    }


    public Integer getPosAttr(String attr){
        for(int i = 0; i < tdItems.length; i++){
            if(tdItems[i].fieldName.equals(attr)){
                return i;
            }
        }
        return null;
    }

    public List<String> getAttrNames(){
        List<String> toReturn = new ArrayList<>();
        for (TDItem item: tdItems) {
            toReturn.add(item.fieldName);
        }
        return toReturn;
    }

    public List<String> getPKNames(){
        List<String> toReturn = new ArrayList<>();
        for (Integer keyIndex: getPKIndex()) {
            if(tdItems[keyIndex] != null)toReturn.add(tdItems[keyIndex].fieldName);
        }
        return toReturn;
    }

    public List<Integer> getPKIndex(){
        List<Integer> toReturn = new ArrayList<>();
        for (int i = 0; i< tdItems.length; i++) {
            for (TDItem pkItem: pkItems) {
                if(pkItem != null && tdItems[i].fieldName.equals(pkItem.fieldName)){
                    toReturn.add(i);
                }
            }
        }
        return toReturn;
    }

    public void removePK(){
        pkItems = new TDItem[1];
    }

    public Pair<List<String>, List<String>> getAttributeFKTable(String tableName){
        Pair<List<String>, List<String>> toReturn = new Pair<>(new ArrayList<>(), new ArrayList<>());
        for(TDItem columns: tdItems){
            if(columns.referenceTable != null && columns.referenceTable.equals(tableName)){
                toReturn.a.add(columns.fieldName);
                toReturn.b.add(columns.attrNameReferenceTable);
            }
        }
        return toReturn;
    }

    public List<String> getFKTables(){
        List<String> toReturn = new ArrayList<>();
        for(TDItem column: tdItems){
            boolean isFound = false;
            for(String name: toReturn){
                if(name.equals(column.referenceTable)){
                    isFound = true;
                    break;
                }
            }
            if(column.referenceTable != null && !isFound)toReturn.add(column.referenceTable);
        }
        return toReturn;
    }

    public List<TDItem> getIntersection(TupleDesc td){
        List<TDItem> intersection = new ArrayList<>();
        for(int i = 0; i < tdItems.length; i++){
            for(int j = 0; j < td.numFields(); j++){
                if(tdItems[i].fieldName.equals(td.getFieldName(j))){
                    intersection.add(tdItems[i]);
                }
            }
        }
        return intersection;
    }
    /**
     * Returns a String describing this descriptor. It should be of the form
     * "fieldType[0](fieldName[0]), ..., fieldType[M](fieldName[M])", although
     * the exact format does not matter.
     * 
     * @return String describing this descriptor.
     */
    public String toStringFirstKeys() {
        String s = "";
        List<Integer> pkIndexs = getPKIndex();

        for(Integer itemPkIndex: pkIndexs){
            s += "**"+tdItems[itemPkIndex]+" ";
        }

        for (int i = 0; i < tdItems.length; i++) {
            boolean isFound = false;
            for(Integer pkIndex: pkIndexs){
                if(pkIndex == i){
                    isFound = true;
                    break;
                }
            }
            if(!isFound) {
                s += tdItems[i] + " ";
            }
        }
        return s;
    }

    public String toString(){
        String s = "";
        for(int i = 0; i < tdItems.length; i++){
            for(Integer keyIndex: getPKIndex()){
                if(i == keyIndex){
                    s += "**";
                    break;
                }
            }
            s += tdItems[i].toString() + " ";
        }
        return s;
    }
}
