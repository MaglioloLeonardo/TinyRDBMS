package com.basePackage.PhysicalLayer.Exceptions;
import com.basePackage.PhysicalLayer.Type;

public class InvalidInputFieldException extends Exception {
    public String message;
    public InvalidInputFieldException(String input, Type type){
        message = "The input:'"+ input + "' is not valid for the field:'" + type.toString() + "'";
    }
    public String toString(){
        return message;
    }
}