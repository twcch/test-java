package com.twcch.test.array;

import java.util.Arrays;

public class ArrayCopyRange {

    public static void main(String[] args) {

        int[] ints = new int[]{1, 2, 3, 4, 5};
        int[] ints1 = Arrays.copyOfRange(ints, 1, 3);

        for (int i : ints1) {
            System.out.print(i + " ");
        }

    }

}
