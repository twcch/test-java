package com.twcch.test.referencetype;

public class StringConvert {

    public static void main(String[] args) {

        String str = "3.14";
        Double d = Double.parseDouble(str);

        System.out.println(d.intValue());

    }

}
