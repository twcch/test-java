package com.twcch.test.processcontrol;

public class RecursiveMethod {

    public static void main(String[] args) {

        new Test().printNumber(1);
        System.out.println();
        new Test().printNumber2(10);
        System.out.println();
        new Test().printNumber3(1, 10);
        System.out.println();
        System.out.print(new Test().plusNumber(10));
        System.out.println();
        System.out.print(new Test().plusNumber2(1));
        System.out.println();
        System.out.print(new Test().plusNumber3(1, 100));
        System.out.println();
        System.out.print(new Test().power(2, 4));

    }

}

class Test {

    public void printNumber(int start) {
        System.out.print(start + " ");

        if (start < 10) {
            printNumber(start + 1);
        }
    }

    public void printNumber2(int end) {
        if (end > 1) {
            printNumber2(end - 1);
        }

        System.out.print(end + " ");
    }

    public void printNumber3(int start, int end) {
        System.out.print(start + " ");

        if (start < end) {
            printNumber3(start + 1, end);
        }
    }

    public int plusNumber(int end) {
        if (end == 1) {
            return 1;
        }
        return end + plusNumber(end - 1);
    }

    public int plusNumber2(int start) {
        if (start < 100) {
            return start + plusNumber2(start + 1);
        }
        return 100;
    }

    public int plusNumber3(int start, int end) {
        if (start < end) {
            return start + plusNumber3(start + 1, end);
        }
        return end;
    }

    public int power(int base, int pow) {
        if (pow == 1) {
            return base;
        }
        return base * power(base, pow - 1);
    }

}
