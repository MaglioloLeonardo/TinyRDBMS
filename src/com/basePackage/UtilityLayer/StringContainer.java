package com.basePackage.UtilityLayer;

public class StringContainer {
    String string;

    public StringContainer(String string){
        this.string = string;
    }

    public void changeString(String string){
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }
}
