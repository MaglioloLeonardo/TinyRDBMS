package com.basePackage.PhysicalLayer.Exceptions;

public class RepeatedAttributeException extends Exception {
    public String message;
    public RepeatedAttributeException(String attrName){
        message = attrName + " was already declerated for this table";
    }

    public String toString(){
        return message;
    }
}
