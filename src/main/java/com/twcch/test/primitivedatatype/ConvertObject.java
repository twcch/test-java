package com.twcch.test.primitivedatatype;

public class ConvertObject {

    public static void main(String[] args) {

        Double d = new Double(3.14); // It is deprecated and marked for removal.
        System.out.println(d.intValue());

        Integer i = new Integer(10); // It is deprecated and marked for removal.
        System.out.println(i.SIZE);

        float f1 = 3.14F;
        Float f2 = Float.valueOf(f1);
        System.out.println(f2.floatValue());

        // autoboxing
        double d1 = 3.14;
        Double d2 = d1; // Double d2 = d1.doubleValue();

        // unboxing
        Integer i1 = new Integer(5);
        int i2 = i1; // Integer i2 = i1.integerValue();

    }

}
