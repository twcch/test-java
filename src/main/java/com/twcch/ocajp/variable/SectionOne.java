/*
 * Github: https://github.com/twcch
 * Website: https://twcch.github.io/
 * Author: 謝志謙 Alan Hsieh
 */

package com.twcch.ocajp.variable;

public class SectionOne {

    public static void main(String[] args) {

        int a = 1;
        a++;
        System.out.println(a++); // 會將 a 先 print 出來，再進行 a++

        int b = 5;
        b--;
        System.out.println(--b); // 會先進行 --b ，再將 b print 出

        int p = 10;
        int q = 20;
        /*
         * int r = q += p / 5;
         * int r = q = q + p / 5;
         * p = 10;
         * q = 22;
         * r = 22;
         */
        int r = q += p / 5;

    }

}
