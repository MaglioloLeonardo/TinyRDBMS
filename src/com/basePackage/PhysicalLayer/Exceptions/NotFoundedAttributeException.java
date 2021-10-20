package com.basePackage.PhysicalLayer.Exceptions;

import com.basePackage.PhysicalLayer.Table;
import com.basePackage.PhysicalLayer.Tuple;

public class NotFoundedAttributeException extends Exception{
    public String message;
    public NotFoundedAttributeException(String nameField, String nameTable){
        this.message = "The following column:" + nameField + " does not exits in table:" + nameTable;
    }

    public NotFoundedAttributeException(String nameField){
        this.message = "The following column:" + nameField + " does not exits in this table";
    }

    public String toString(){
        return message;
    }
}
