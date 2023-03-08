package com.twcch.test.array;

import java.util.Arrays;

public class ArraySearch {

    public static void main(String[] args) {

        int searchValue = 3;

        int[] ints = new int[]{1, 5, 6, 4, 2, 3};

        // search method 1

        int index = 0;
        for (int i = 0; i < ints.length; i++) {
            if (searchValue == ints[i]) {
                break;
            } else {

            }
            index++;
        }

        System.out.println(index);

        // search method 2
        Arrays.sort(ints);
        System.out.println(Arrays.binarySearch(ints, searchValue));

    }

}
