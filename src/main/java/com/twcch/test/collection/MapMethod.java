package com.twcch.test.collection;

import java.util.HashMap;
import java.util.Map;

public class MapMethod {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println(map.get("A"));

        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }

    }

}
