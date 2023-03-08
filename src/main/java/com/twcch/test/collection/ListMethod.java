package com.twcch.test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMethod {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("A"); // 時間複雜度 O(1)
        list.add("B");
        list.add("C");

        list.remove(1); // 時間複雜度 O(1)

        list.set(1, "Z"); // 時間複雜度 O(1)

        list.add(2, "D"); // 時間複雜度 O(N) 指定位置插入

        System.out.println(list.get(0));

        Collections.sort(list); // list sort 時間複雜度 O(N log N)

        for (String i : list) {
            System.out.print(i + " ");
        }

    }

}
