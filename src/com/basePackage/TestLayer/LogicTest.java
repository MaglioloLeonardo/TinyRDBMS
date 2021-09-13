package com.basePackage.TestLayer;

import com.basePackage.PhysicalLayer.FileUtility;
import com.basePackage.PhysicalLayer.Table;
import com.basePackage.PhysicalLayer.TableManager;

public class LogicTest {
    public static void main(String[] args){
        long session = 2811116049440841932L;
        System.out.println(TableManager.getInstance().getTable("abc", session).toString());

    }
}
