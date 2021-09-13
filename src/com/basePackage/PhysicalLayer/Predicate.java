package com.basePackage.PhysicalLayer;

import java.io.Serializable;
import com.basePackage.LogicLayer.WhereClauseTree.Operators;

/**
 * Predicate compares tuples to a specified Field value.
 */
public class Predicate implements Serializable {

    private static final long serialVersionUID = 1L;

    private Operators.Op op;
    private int field;
    private Field operand;

    /** Constants used for return codes in Field.compare */
    
    /**
     * Constructor.
     * 
     * @param field
     *            field number of passed in tuples to compare against.
     * @param op
     *            operation to use for comparison
     * @param operand
     *            field value to compare passed in tuples to
     */

    public Predicate(int field, Operators.Op op, Field operand) {
        this.field = field;
        this.op = op;
        this.operand = operand;
    }

    /**
     * @return the field number
     */
    public int getField()
    {
        return this.field;
    }

    /**
     * @return the operator
     */
    public Operators.Op getOp()
    {
        return this.op;
    }
    
    /**
     * @return the operand
     */
    public Field getOperand()
    {
        return this.operand;
    }
    
    /**
     * Compares the field number of t specified in the constructor to the
     * operand field specified in the constructor using the operator specific in
     * the constructor. The comparison can be made through Field's compare
     * method.
     * 
     * @param t
     *            The tuple to compare against
     * @return true if the comparison is true, false otherwise.
     */
    /*
    public boolean filter(Tuple t) {
        Field f = t.getField(field);
        return f.compare(op, operand);
    }*/

    /**
     * Returns something useful, like "f = field_id op = op_string operand =
     * operand_string
     */
    public String toString() {
        String p = "";
        p += "f = " + field + " op = " + op + " operand = " + operand;
        return p;
    }
}
