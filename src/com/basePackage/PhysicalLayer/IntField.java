package com.basePackage.PhysicalLayer;

import com.basePackage.LogicLayer.WhereClauseTree.Operators;

import java.io.*;

/**
 * Instance of Field that stores a single integer.
 */
public class IntField implements Field {
    
	private static final long serialVersionUID = 1L;
	private final int value;

    public int getValue() {
        return value;
    }

    /**
     * Constructor.
     *
     * @param i The value of this field.
     */
    public IntField(int i) {
        value = i;
    }

    public String toString() {
        return Integer.toString(value);
    }

    public int hashCode() {
        return value;
    }

    public boolean equals(Object field) {
        if(!(field instanceof IntField)){
            return false;
        }
        return ((IntField) field).value == value;
    }

    public void serialize(DataOutputStream dos) throws IOException {
        dos.writeInt(value);
    }

    /**
     * Compare the specified field to the value of this Field.
     * Return semantics are as specified by Field.compare
     *
     * @see Field#compare
     */
    public boolean compare(Operators.OrderBooleanOp op, Field val) throws InvalidObjectException{
        if(val instanceof NullField)
            return false;
        if(!(val instanceof IntField)){
            throw new InvalidObjectException("");
        }

        IntField iVal = (IntField) val;

        switch (op) {
        case EQUALS:
            return value == iVal.value;
        case NOT_EQUALS:
            return value != iVal.value;

        case GREATER_THAN:
            return value > iVal.value;

        case GREATER_THAN_OR_EQ:
            return value >= iVal.value;

        case LESS_THAN:
            return value < iVal.value;

        case LESS_THAN_OR_EQ:
            return value <= iVal.value;
        }

        return false;
    }

    public Field arithmetic(Operators.ArithmeticOp op, Field value)throws InvalidObjectException{
        if(value instanceof NullField)
            return this;
        if(!(value instanceof IntField)){
            throw new InvalidObjectException("");
        }

        IntField iVal = (IntField) value;

        switch (op) {
            case ADD:
                return new IntField(this.value+iVal.value);
            case SUB:
                return new IntField(this.value-iVal.value);

            case MUL:
                return new IntField(this.value*iVal.value);

            case DIV:
                return new IntField(this.value/iVal.value);
        }

        return this;
    }

    /**
     * Return the Type of this field.
     * @return Type.INT_TYPE
     */
	public Type getType() {
		return Type.INT_TYPE;
	}

}
