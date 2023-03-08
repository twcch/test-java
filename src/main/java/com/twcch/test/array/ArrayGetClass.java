package com.twcch.test.array;

public class ArrayGetClass {

    public static void main(String[] args) {

        int[] ints = {1, 2, 3, 4, 5};
        /*
         * returns true if this object represents an array class, else false
         * checking for array
         */
        System.out.println(ints.getClass().isArray());

    }

}
