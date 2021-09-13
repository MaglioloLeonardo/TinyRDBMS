package com.basePackage.TestLayer;

import com.basePackage.PhysicalLayer.*;
import com.basePackage.PhysicalLayer.Exceptions.InvalidKeyException;
import com.basePackage.PhysicalLayer.Exceptions.InvalidTupleException;
import com.basePackage.PhysicalLayer.Exceptions.RepeatedAttributeException;
import com.basePackage.PhysicalLayer.StringField;

public class PhysicalLayerTests {

    public static void main(String[] args) throws RepeatedAttributeException, InvalidTupleException {

        try{
            long init = System.currentTimeMillis();
            createPagesTest();
            //removeTuples();
            long p1 = (System.currentTimeMillis()-init)/1000;
            long p2 = (System.currentTimeMillis()-init)/1000;
            System.out.println("p1:" + p1 + "\np2:"+p2);
        }catch (Exception e){
            System.out.println("ERRORE, terminato con eccezione:" + e);
        }
        //tm.deleteTable();
    }

    /*public static void partialReemp() throws RepeatedAttributeException, InvalidTupleException, InvalidKeyException {
        createPagesTest();
        createPagesTest();
        createPagesTest();
        removeTuples();
        createPagesTest();
    }

    public static void removeTuples() throws RepeatedAttributeException, InvalidTupleException, InvalidKeyException{
        TableManager tm = TableManager.getInstance();

        String[] fieldAr = new String[]{"267567567"};
        TupleDesc td = new TupleDesc(new Type[]{Type.STRING_TYPE}, fieldAr, new Boolean[]{true});

        Table t = tm.getTable("Prova");

        //t.removeTuple(new Tuple(td));

        tm.shutDown();
    }*/

    public static void createPagesTest() throws RepeatedAttributeException, InvalidKeyException {
        TableManager tm = TableManager.getInstance();


        String[] fieldAr = new String[]{"267567567"};
        TupleDesc td = new TupleDesc(new Type[]{Type.STRING_TYPE}, fieldAr, new Boolean[]{false});
        /*Dichiarazione di una descrizione tupla con un solo campo stringa con nome 267567567
          In generale fieldAr.len == Type[].len
         */
        tm.CreateTable("Prova1", td);
        Table t = tm.getTable("Prova1");
        try {
            for(int i = 1; i<= /*1000*10000*/100; i++){
                Tuple tuple = new Tuple(td); //creazione tupla
                if(i%2 == 0){
                    tuple.setField("267567567", new StringField(Integer.toString(i), 100)); //aggiunta valore tupla
                }else{
                    //tuple.setField("267567567", new NullField());
                    tuple.setField("267567567", new StringField(Integer.toString(i), 100));
                }
                t.addTuple(tuple);

            }
        }catch (Exception e){
            e.printStackTrace();
        }

        tm.shutDown();
        System.out.println(t);
    }

}
