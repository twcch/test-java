package com.twcch.test.array;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        int[][] ints = {{1, 2, 3}, {9, 8}};
        System.out.println("ints[0][1]: " + ints[0][1]);

        System.out.println(ints.length);
        System.out.println(ints[0].length);
        System.out.println(ints[1].length);

        short[][] shorts = new short[2][3];
        shorts[0][0] = 7;
        shorts[0][1] = 8;
        System.out.println("shorts[0][0]: " + shorts[0][0]);

    }

}
