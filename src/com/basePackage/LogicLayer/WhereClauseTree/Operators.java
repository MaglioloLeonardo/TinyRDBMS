package com.basePackage.LogicLayer.WhereClauseTree;

import java.io.Serializable;

public class Operators {
    public enum Op implements Serializable {
        EQUALS, GREATER_THAN, LESS_THAN, LESS_THAN_OR_EQ, GREATER_THAN_OR_EQ,
        NOT_EQUALS, AND, OR, NOT, LEAF, ADD, SUB, MUL, DIV, ISNULL;

        public String toString() {
            if (this == EQUALS)
                return "=";
            if (this == GREATER_THAN)
                return ">";
            if (this == LESS_THAN)
                return "<";
            if (this == LESS_THAN_OR_EQ)
                return "<=";
            if (this == GREATER_THAN_OR_EQ)
                return ">=";
            if (this == NOT_EQUALS)
                return "<>";
            if (this == NOT)
                return "NOT";
            if (this == AND)
                return "AND";
            if (this == OR)
                return "OR";
            if (this == ADD)
                return "+";
            if (this == SUB)
                return "-";
            if (this == MUL)
                return "*";
            if (this == DIV)
                return "/";
            return  "";
        }
    }

        public enum UnaryBooleanOp{
            NOT, LEAF;
            @Override
            public String toString() {
                if (this == NOT)
                    return "NOT";
                return "";
            }
        }

        public enum BinaryBooleanOp{
            AND, OR;
            @Override
            public String toString() {
                if (this == AND)
                    return "AND";
                if (this == OR)
                    return "OR";
                return "";
            }
        }

        public enum ArithmeticOp{
            ADD, SUB, MUL, DIV;
            @Override
            public String toString(){
                if (this == ADD)
                    return "+";
                if (this == SUB)
                    return "-";
                if (this == MUL)
                    return "*";
                if (this == DIV)
                    return "/";
                return "";
            }
        }

        public enum OrderBooleanOp{
            EQUALS, GREATER_THAN, LESS_THAN, LESS_THAN_OR_EQ, GREATER_THAN_OR_EQ,
            NOT_EQUALS;

            public String toString(){
                if (this == EQUALS)
                    return "=";
                if (this == GREATER_THAN)
                    return ">";
                if (this == LESS_THAN)
                    return "<";
                if (this == LESS_THAN_OR_EQ)
                    return "<=";
                if (this == GREATER_THAN_OR_EQ)
                    return ">=";
                if (this == NOT_EQUALS)
                    return "<>";
                return "";
            }
        }

        public enum NullOp{
            ISNULL;
            public String toString(){
                if (this == ISNULL)
                    return "IS NULL";
                return "";
            }
        }


}
