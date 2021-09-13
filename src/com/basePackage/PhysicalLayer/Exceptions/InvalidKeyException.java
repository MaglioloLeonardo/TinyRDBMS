package com.basePackage.PhysicalLayer.Exceptions;

public class InvalidKeyException extends Exception {
    public String message;
    public InvalidKeyException(){
        message = "The key for this table is invalid or all the attributes are nullable";
    }
    public String toString(){
        return message;
    }
}