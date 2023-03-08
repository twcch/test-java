package com.twcch.test.method;

public class DimMethod {

    public static void main(String[] args) {

        int a = 2;
        int b = 2;

        DimMethod dimMethod = new DimMethod();
        MathHelper mathHelper = new MathHelper();

        System.out.println(dimMethod.mathpow(a, b));
        System.out.println(mathHelper.power(a, b));

    }

    public int mathpow(int a, int b) {

        int c = (int) Math.pow(a, b);

        return c;
    }

}
