package com.twcch.test.array;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {

        int[] ints1 = new int[]{4, 3, 5};
        int[] ints2 = new int[]{7, 9, 3, 2, 1};

        // sort method 1

        Arrays.sort(ints1); // 時間複雜度 O(N log N)

        for (int i : ints1) {
            System.out.print(i + " ");
        }

        System.out.println();

        // sort method 2

        int temp = 0;
        for (int i = 0; i < ints2.length; i++) {
            for (int j = 0; j < ints2.length; j++) {
                if (ints2[i] < ints2[j]) {
                    temp = ints2[j];
                    ints2[j] = ints2[i];
                    ints2[i] = temp;
                }
            }
        }

        for (int i : ints2) {
            System.out.print(i + " ");
        }

    }

}
