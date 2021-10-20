package com.basePackage.PhysicalLayer.Exceptions;

import com.basePackage.PhysicalLayer.Table;

public class ReferencedTableException extends Exception {
    public String message;
    public ReferencedTableException(Table t){
        message = "The following table :'" + t.getName() + "' is beeing referenced by: " + t.getReferencedTable() + " " +
                "and can't be deleted";
    }
    public String toString(){
        return message;
    }
}