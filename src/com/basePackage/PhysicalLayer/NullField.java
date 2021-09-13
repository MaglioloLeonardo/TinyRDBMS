package com.basePackage.PhysicalLayer;

import com.basePackage.LogicLayer.WhereClauseTree.Operators;
import com.basePackage.PhysicalLayer.Field;
import com.basePackage.PhysicalLayer.Type;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.Serial;


public class NullField implements Field {
    @Serial
    private static final long serialVersionUID = 1L;
    /**
     * Write the bytes representing this field to the specified
     * DataOutputStream.
     * @see DataOutputStream
     * @param dos The DataOutputStream to write to.
     */
    public void serialize(DataOutputStream dos) throws IOException{
        dos.writeInt(Integer.MIN_VALUE);
    }

    /**
     * Compare the value of this field object to the passed in value.
     * @param op The operator
     * @param value The value to compare this Field to
     * @return Whether or not the comparison yields true.
     */
    public boolean compare(Operators.OrderBooleanOp op, Field value){
        return false;
    }

    public Field arithmetic(Operators.ArithmeticOp op, Field value)throws InvalidObjectException{
        return value;
    }
    /**
     * Returns the type of this field (see {@link Type#INT_TYPE} or {@link Type#STRING_TYPE}
     * @return type of this field
     */
    public Type getType(){
        return  null;
    }

    /**
     * Hash code.
     * Different Field objects representing the same value should probably
     * return the same hashCode.
     */
    public int hashCode(){
        return Integer.MIN_VALUE;
    }

    public boolean equals(Object field){
        return field.getClass() == this.getClass();
    }

    public String toString(){
        return "<NULL>";
    }
}
