package com.twcch.test.array;

public class TraversalArray {

    public static void main(String[] args) {

        int[] ints = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }

        System.out.println();

        for (int i = ints.length - 1; i >= 0; i--) {
            System.out.print(ints[i] + " ");
        }

        System.out.println();

        for (int i : ints) {
            System.out.print(i + " ");
        }

    }

}
