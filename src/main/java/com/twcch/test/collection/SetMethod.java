package com.twcch.test.collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethod {

    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();

        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("F");
        set.add("G");
        set.add("H");
        set.add("I");

        System.out.println(set.size());

        set.remove("C");

        System.out.println(set.size());

        for (String i : set) {
            System.out.print(i + " ");
        }

    }

}
