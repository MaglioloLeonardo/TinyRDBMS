package com.basePackage.PhysicalLayer.Exceptions;

public class RepeatedAttributeException1 extends Exception {
    public String message;
    public RepeatedAttributeException1(String attrName){
        message = attrName + " was already declerated for this table";
    }

    public String toString(){
        return message;
    }
}
