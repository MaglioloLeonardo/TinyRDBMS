package com.basePackage.PhysicalLayer.Exceptions;

import com.basePackage.PhysicalLayer.Table;

public class NotFoundedTableException extends Exception {
    public String message;
    public NotFoundedTableException(String tableName){
        message = "The following table :'" + tableName + "' doesn't exits";
    }
    public String toString(){
        return message;
    }
}