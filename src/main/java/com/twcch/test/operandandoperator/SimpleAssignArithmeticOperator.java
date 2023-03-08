package com.twcch.test.operandandoperator;

public class SimpleAssignArithmeticOperator {

    public static void main(String[] args) {

        int a = 3;
        int b = 4;

        a += 3; // 同 a = a + 3;
        System.out.println("a: " + a);

        b -= 2; // 同 b = b - 2;
        System.out.println("b: " + b);

        a *= 3; // 同 a = a * 3;
        System.out.println("a: " + a);

        b /= 2; // 同 b = b / 2;
        System.out.println("b: " + b);

        a %= 3; // 同 a = a % 3;
        System.out.println("a: " + a);

    }

}
