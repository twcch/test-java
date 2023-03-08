package com.twcch.test.array;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {

        int[] ins1 = new int[3];
        ins1[0] = 1;
        ins1[1] = 2;
        ins1[2] = 3;

        int[] ins2 = Arrays.copyOf(ins1, 5);
        ins2[0] = 9;
        ins2[1] = 8;

        System.out.print("ins1: ");
        for (int i = 0; i < ins1.length; i++) {
            System.out.print(ins1[i] + " ");
        }

        System.out.println();

        System.out.print("ins2: ");
        for (int i = 0; i < ins2.length; i++) {
            System.out.print(ins2[i] + " ");
        }

        System.out.println();

        /*
         * int[] ins3 = ins2, 非將 ins2 複製給 ins3 > 是將 ins2 物件的 reference 給 ins3
         * 當對 ins3 做 overriding 後，ins2 也會被改變
         */
        int[] ins3 = ins2;
        ins3[0] = 100;

        System.out.print("ins2: ");
        for (int i = 0; i < ins2.length; i++) {
            System.out.print(ins2[i] + " ");
        }

        System.out.println();

        System.out.print("ins3: ");
        for (int i = 0; i < ins3.length; i++) {
            System.out.print(ins3[i] + " ");
        }

    }

}
