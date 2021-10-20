package com.basePackage.PhysicalLayer.Exceptions;

import com.basePackage.PhysicalLayer.Table;
import com.basePackage.PhysicalLayer.Tuple;

public class InvalidKeyTupleException extends Exception {
    public String message;

    public InvalidKeyTupleException(Tuple tuple, Table table){
        this.message = "InvalidKeyTupleException: the following tuple:" + tuple.toString() + " violates key constrains on table: " + table.getName();
    }

    public String toString(){
        return message;
    }

}
