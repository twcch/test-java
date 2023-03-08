package com.twcch.demo;

public class TypeConvertDemo {

    public static void main(String[] args) {

        double d = 3.14;
        String str = String.valueOf(d);
        float f = Float.parseFloat(str);

        Float f2 = Float.valueOf(f);
        System.out.println(f2.intValue());

    }

}
