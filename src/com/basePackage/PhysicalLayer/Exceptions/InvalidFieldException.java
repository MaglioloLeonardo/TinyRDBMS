package com.basePackage.PhysicalLayer.Exceptions;

public class InvalidFieldException extends Exception {
    public String message;
    public InvalidFieldException(String nameField, String field){
        message = "The value: '" + field + "' is not valid for the column " + nameField;
    }

    public InvalidFieldException(String field){
        message = "The value: '" + field + "' is not valid for the column selected";
    }
    public String toString(){
        return message;
    }
}