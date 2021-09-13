package com.basePackage.PhysicalLayer;

import com.basePackage.LogicLayer.WhereClauseTree.*;
import com.basePackage.PhysicalLayer.Exceptions.*;
import org.antlr.v4.runtime.misc.Pair;
import com.bethecoder.ascii_table.ASCIITable;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Table implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private TupleDesc tdesc;
    private String name;
    private Long sessionID = null;
    private AtomicInteger lastID = new AtomicInteger(0);
    private AtomicInteger firstIDToWrite = new AtomicInteger(1);
    private transient PageManager pageManager;
    private Page LastPage = null;
    private List<String> referencedTable = new ArrayList<>(); // tabelle che si riferiscono a questa per mezzo di fk
    private List<String> refersToTable = new ArrayList<>(); //tabelle a cui questa tabella si riferisce per mezzo di fk

    public Table(String name,TupleDesc tdesc){
        this.name = name;
        this.tdesc = tdesc;
        this.pageManager = PageManager.getPageManager();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public TupleDesc getTupleDesc() {
        return tdesc;
    }

    public void setTupleDesc(TupleDesc tdesc) {
        this.tdesc = tdesc;
    }

    public void addTuple(Tuple t) throws InvalidKeyTupleException, NotFoundedAttributeException, InvalidTupleException {
        addTuple(t, true);
    }

    public void addTuple(Tuple t, boolean performConsistencyControls) throws InvalidTupleException, InvalidKeyTupleException, NotFoundedAttributeException {
        if(performConsistencyControls && !t.getTupleDesc().equals(tdesc))
            throw  new InvalidTupleException(t, this);
        else if(performConsistencyControls && !canBeAddedTuple(t)){
            throw new InvalidKeyTupleException(t, this);
        }else{
            if(lastID.get() == 0)genPage();

            if(firstIDToWrite.get() == lastID.get()){
                genPage();
            }

            Page page = getPage(firstIDToWrite.get());

            page.addTuple(t);
            if(page.isFull()){
                firstIDToWrite.getAndIncrement();
            }
        }
    }

    public void addForeignKey(TupleDesc fk) throws RepeatedAttributeException, InvalidKeyException {
        if(fk != null) {
            List<String> pk = tdesc.getPKNames();
            tdesc = TupleDesc.merge(tdesc, fk, false);
            tdesc.setKey(pk.toArray(String[]::new));
            for(String tableName :fk.getFKTables()){
                Table table = TableManager.getInstance().getTable(tableName);
                assert table != null;
                table.addReferenceTable(this.name);
                addRefersToTable(tableName);
            }
        }
    }

    public void setPageManager(PageManager pageManager) {
        this.pageManager = pageManager;
    }

    public void addRefersToTable(String tableName){
        boolean isFound = false;
        for(String name : refersToTable){
            if(name.equals(tableName)){
                isFound = true;
                break;
            }
        }
        if(!isFound){
            refersToTable.add(tableName);
        }
    }

    public void addReferenceTable(String tableName){
        boolean isFound = false;
        for(String name : referencedTable){
            if(name.equals(tableName)){
                isFound = true;
                break;
            }
        }
        if(!isFound){
            referencedTable.add(tableName);
        }
    }

    public List<String> getReferencedTable(){
        return new ArrayList<>(referencedTable);
    }

    public List<String> getRefersToTable(){
        return new ArrayList<>(refersToTable);
    }

    public void removeReferenceTable(String tableName){
        referencedTable.removeIf(name -> name.equals(tableName));
    }

    private void genPage(){
        int id = lastID.incrementAndGet();
        Page toCreate = new Page(tdesc, name, id);
        toCreate.setSessionID(sessionID);
        pageManager.addNewPage(toCreate);
    }

    public String getStringTableSelect(List<String> attrToSelect, WhereBooleanTree tree) throws NotFoundedAttributeException, InvalidTypesException {
        String toReturn = null;
        if(attrToSelect.get(0).equals("*")){
            toReturn = tableToString(tdesc.getAttrNames(), false, tree);
        }else{
            toReturn = tableToString(attrToSelect, false, tree);
        }
        return toReturn;
    }

    public String tableToString(List<String> attrToSelect, boolean printNameTable, WhereBooleanTree tree) throws NotFoundedAttributeException, InvalidTypesException {
        String [] tableHeaders = new String[attrToSelect.size()];
        String [] tdToString = tdesc.toString().split("\\s+");
        for(int i = 0; i < tableHeaders.length; i++){
            for(String name: tdToString){
                String[] parsedName = name.split("-FK:|\\+|\\(|\\*+");
                for(String token: parsedName) {
                    boolean founded = false;
                    if (token.equals(attrToSelect.get(i))) {
                        tableHeaders[i] = name;
                        founded = true;
                    }
                    if(founded){
                        break;
                    }
                }
            }
        }

        int[] posData = new int[attrToSelect.size()];
        List<String[]> tuples = new ArrayList<>();

        for(int i = 0; i<attrToSelect.size(); i++){
            Integer result = tdesc.getPosAttr(attrToSelect.get(i));
            if(result != null){
                posData[i] = result;
            }else throw new NotFoundedAttributeException(attrToSelect.get(i));
        }

        pageManager.fetchSequenceOfPages(this, 1, lastID.get());
        for(int i = 1; i <= lastID.get(); i++){
            List<String> rows= Arrays.asList(getPage(i).toString(tree).split("[\n]+"));
            for(String row: rows){
                String attrRow[] = row.split("\\s+");
                if(!row.equals("")){
                    String toAdd[] = new String[attrToSelect.size()];
                    for(int j = 0; j < attrToSelect.size(); j++){
                        toAdd[j] = attrRow[posData[j]];

                    }
                    tuples.add(toAdd);
                }
            }
        }

        String[][] tableData = new String[tuples.size()][attrToSelect.size()];


        for(int i = 0; i < tuples.size(); i++){
            tableData[i] = tuples.get(i);
        }

        if(tuples.size() == 0){
            tableData = new String[1][tableHeaders.length];
            tableData[0] = new String[tableHeaders.length];
            for(int i = 0; i < tableHeaders.length; i++){
                tableData[0][i] = "";
            }
        }

        String toReturn = "Legend: [** -> pk member, + -> not nullable, FK:<TableName, NameAttrinuteTableName>]\n"
                + ASCIITable.getInstance().getTable(tableHeaders, tableData).toString();

        if(printNameTable){
            toReturn = "Table: " + name + "\n" + toReturn;
        }

        return toReturn;
    }

    private Page getPage(int i){
        Page page;
        if(LastPage != null && LastPage.getPID().first.equals(String.valueOf(i)) && LastPage.isValid()
            && ((sessionID == null && LastPage.getSessionID() == null) ||(
                sessionID != null && sessionID.equals(LastPage.getSessionID())))){
            return LastPage;
        }else{
            if(sessionID == null){
                page = pageManager.getPage(name, i);
            }else page = pageManager.getPage(name, i, sessionID);
            LastPage = page;
        }
        return page;
    }

    private boolean canBeAddedTuple(Tuple t) throws NotFoundedAttributeException {

        if(existTupleWithValues( tdesc.getPKNames(), t.getPKFieds())) return false;
        for(String tableName: refersToTable){
            Table table = TableManager.getInstance().getTable(tableName);
            assert table != null;
            Pair<List<String>, List<String>> pair = tdesc.getAttributeFKTable(tableName);
            List<Field> values = new ArrayList<>();
            for(String nameColumn: pair.a){
                values.add(t.getField(nameColumn));
            }

            if(!(table.existTupleWithValues(pair.b, values)))return  false;
        }
        return  true;
    }

    public boolean existTupleWithValues(List<String> names, List<Field> values) throws NotFoundedAttributeException {
        assert names != null && values != null;
        assert  names.size() == values.size();

        List<String> elaboratedNames = new ArrayList<>();
        List<Field> elaboratedValues = new ArrayList<>();

        //deleted multiple attributes with the same name

        for(int i = 0; i < names.size(); i++){
            boolean isFirst = true;
            boolean founded = false;
            for(int j = 0; j<names.size(); j++){
                if(names.get(i).equals(names.get(j))){
                    if(values.get(i).equals(values.get(j))){
                        if(j<i){
                            isFirst = false;
                        }
                        if(!(i==j) && !isFirst)founded = true;
                    }else{
                        return false;
                    }
                }
            }
            if(!founded){
                elaboratedNames.add(names.get(i));
                elaboratedValues.add(values.get(i));
            }
        }

        if(lastID.get()>0){
            pageManager.fetchSequenceOfPages(this, 1, lastID.get());
        }
        for(int i = 1; i<=lastID.get(); i++){
            Page page = getPage(i);
            boolean result = page.existTupleWithValues(elaboratedNames, elaboratedValues);
            if(result){
                return true;
            }
        }
        return false;
    }

    public boolean copyAtSession(long sessionID, String newName){
        boolean toReturn =  FileUtility.copyTableInSession(getName(), sessionID, newName);
        return toReturn;
    }

    public Long getSessionID() {
        return sessionID;
    }

    public void setSessionID(Long sessionID) {
        this.sessionID = sessionID;
    }

    public void performJoin(Table leftTable, Table rightTable, WhereBooleanTree tree) throws RepeatedAttributeException, NotFoundedAttributeException, InvalidTypesException, InvalidKeyTupleException, InvalidTupleException, InvalidFieldException {
        List<TupleDesc.TDItem> intersection = leftTable.getTupleDesc().getIntersection(rightTable.getTupleDesc());
        if(intersection.size()>0){
            throw new RepeatedAttributeException(intersection.toString());
        }
        if(leftTable.lastID.get() > 0 && rightTable.lastID.get() > 0){
            pageManager.fetchSequenceOfPages(leftTable, 1, leftTable.lastID.get());
            pageManager.fetchSequenceOfPages(rightTable, 1, rightTable.lastID.get());
            for(int i = 1; i<=leftTable.lastID.get(); i++){
                Page leftPage = leftTable.getPage(i);
                for(int j = 1; j<=rightTable.lastID.get(); j++){
                    Page.performJoin(this, leftTable, leftPage, rightTable, rightTable.getPage(j), tree);
                }
            }
        }
    }

    public void performCartesianProduct(Table leftTable, Table rightTable) throws RepeatedAttributeException, NotFoundedAttributeException, InvalidTypesException, InvalidKeyTupleException, InvalidTupleException, InvalidFieldException {
        WhereBooleanTree tree = new WhereBooleanTree(new UnaryBooleanNode(true, Operators.UnaryBooleanOp.LEAF),
                new ArrayList<>());
        performJoin(leftTable, rightTable, tree);
    }

    public void removeTuplesWithCondition(WhereBooleanTree tree) throws NotFoundedAttributeException, InvalidTypesException {
        pageManager.fetchSequenceOfPages(this, 1, lastID.get());
        for(int i = 1; i<=lastID.get(); i++){
            Page page = getPage(i);
            page.removeTuplesWithCondition(tree);
        }
    }
}
