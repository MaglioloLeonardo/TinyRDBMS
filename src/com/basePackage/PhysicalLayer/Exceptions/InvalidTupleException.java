package com.basePackage.PhysicalLayer.Exceptions;

import com.basePackage.PhysicalLayer.Table;
import com.basePackage.PhysicalLayer.Tuple;

public class InvalidTupleException extends Exception {
    public String message;

    public InvalidTupleException(Tuple tuple, Table table){
        this.message = "InvalidTupleException: the following tuple:" + tuple.toString() + " is not right for the table:" + table.getName();
    }

    public InvalidTupleException(Tuple tuple, String tableName){
        this.message = "InvalidTupleException: the following tuple:" + tuple.toString() + " is not right for the table:" + tableName;
    }

    public String toString(){
        return message;
    }
}
