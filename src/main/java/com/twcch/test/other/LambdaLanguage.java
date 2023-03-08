package com.twcch.test.other;

import java.util.Comparator;

public class LambdaLanguage {

    public static void main(String[] args) {

        Comparator<Integer> comparator2 = Math::subtractExact;
        Integer result2 = comparator2.compare(5, 2);
        System.out.println(result2);

        /*
         * (Integer x, Integer y): 傳入 public int compare(Integer o1, Integer o2)
         * x - y: return
         */
        Comparator<Integer> comparator = (Integer x, Integer y) -> x - y;
        int result = comparator.compare(5, 2);
        System.out.println(result);

        //
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        int rs = com.compare(5, 2);
        System.out.println(rs);

    }

}
