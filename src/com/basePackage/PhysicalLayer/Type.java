package com.basePackage.PhysicalLayer;

import com.basePackage.PhysicalLayer.Exceptions.InvalidInputFieldException;

import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.io.*;

/**
 * Class representing a type
 * Types are static objects defined by this class; hence, the Type
 * constructor is private.
 */
public enum Type implements Serializable {
    INT_TYPE() {
        @Serial
        private static final long serialVersionUID = 1L;

        @Override
        public int getLen() {
            return 4;
        }

        @Override
        public Field parse(DataInputStream dis) throws ParseException, IOException, InvalidInputFieldException {
            return parse(inputToString(dis));
        }

        public Field parse(String string) throws InvalidInputFieldException {
            try {
                if(string.equals("NULL") || string.equals("<NULL>") || string.equals("'NULL'")){
                    return new NullField();
                }else {
                    if(!isNumeric(string)){
                        throw new InvalidInputFieldException(string, this);
                    }
                    return new IntField(Integer.parseInt(string));
                }
            }  catch (Exception e) {
                throw new InvalidInputFieldException(string, this);
            }
        }

        @Override
        public String toString() {
            return "INT_TYPE";
        }

        public boolean isNumeric(String str) {
            return str.chars().allMatch( Character::isDigit );
        }
    }, STRING_TYPE() {
        @Serial
        private static final long serialVersionUID = 1L;

        @Override
        public int getLen() {
            return STRING_LEN+4;
        }

        @Override
        public Field parse(DataInputStream dis) throws ParseException, IOException, InvalidInputFieldException {
            return parse(inputToString(dis));
        }

        public Field parse(String string) throws ParseException, InvalidInputFieldException {
            try {
                if(string.equals("NULL") || string.equals("<NULL>") || string.equals("'NULL'")){
                    return new NullField();
                }else return new StringField(string);
            }  catch (Exception e) {
                throw new InvalidInputFieldException(string, this);
            }
        }


        @Override
        public String toString() {
            return "STRING_TYPE";
        }
    };

    protected String inputToString(DataInputStream dis) throws IOException {
        return new String(dis.readAllBytes(), StandardCharsets.UTF_8);
    };

    @Serial
    private static final long serialVersionUID = 1L;

    public static final int STRING_LEN = 128;

  /**
   * @return the number of bytes required to store a field of this type.
   */
    public abstract int getLen();

  /**
   * @return a Field object of the same type as this object that has contents
   *   read from the specified DataInputStream.
   * @param dis The input stream to read from
   * @throws ParseException if the data read from the input stream is not
   *   of the appropriate type.
   */
    public abstract Field parse(DataInputStream dis) throws ParseException, IOException, InvalidInputFieldException;

}
