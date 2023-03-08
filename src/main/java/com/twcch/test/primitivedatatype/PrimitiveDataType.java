package com.twcch.test.primitivedatatype;

public class PrimitiveDataType {

    static byte a;
    static short b;
    static int c;
    static long d;
    static float e;
    static double f;
    static boolean g;
    static char h;

    public static void main(String[] args) {

        /*
         * 賦值給變數，儲存值超過型態範圍，會有 overflow
         */

        // byte 8-bits
        byte byteNum = 127;
        System.out.println("byteNum: " + byteNum);
        System.out.println("byte size: " + Byte.SIZE + " / byte range: " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
        System.out.println("byte default: " + a);

        // short 16-bits
        short shortNum = 32767;
        System.out.println("shortNum: " + shortNum);
        System.out.println("short size: " + Short.SIZE + " / short range: " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        System.out.println("short default: " + b);

        // int (integer) 32-bits
        int intNum = 2147483647;
        System.out.println("intNum: " + intNum);
        System.out.println("integer size: " + Integer.SIZE + " / integer range: " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println("int default: " + c);

        // long 64-bits
        long longNum = 4775807L; // long longNum = (long) 4775807; > long longNum = 4775807L;
        System.out.println("longNum: " + longNum);
        System.out.println("long size: " + Long.SIZE + " / long range: " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
        System.out.println("long default: " + d);

        // float 32-bits IEEE754
        float floatNum = 1.23F; // +F, double 比較大無法透過隱式轉型到 float
        System.out.println("floatNum: " + floatNum);
        System.out.println("float size: " + Float.SIZE + " / float range: " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
        System.out.println("float default: " + e);

        // double 64-bits IEEE754
        double doubleNum = 3.14159;
        System.out.println("doubleNum: " + doubleNum);
        System.out.println("double size: " + Double.SIZE + " / double range: " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);
        System.out.println("double default: " + f);

        // boolean 0 (false) or 1 (true)
        boolean booleanValue = true;
        System.out.println("booleanValue: " + booleanValue);
        System.out.println("boolean default: " + g);

        // char 16-bits 0 ~ ffff
        char charValue1 = 'A';
        char charValue2 = 67;
        System.out.println("charValue1: " + charValue1 + " charValue2: " + charValue2);
        System.out.println("char default: " + h);

    }

}
