package com.twcch.test.method;

public class MathHelper {

    public static void main(String[] args) {

        MathHelper mathHelper = new MathHelper();
        System.out.println(mathHelper.intAbs(-20));

    }

    public int power(int a, int b) {

        int result = 1;
        for (int i = 0; i < b; i++) {
            result = result * a;
        }

        return result;

    }

    public int intAbs(int value) {

        return (value >= 0) ? value : -value;

    }

}
