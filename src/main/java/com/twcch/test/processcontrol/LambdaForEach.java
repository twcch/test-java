package com.twcch.test.processcontrol;

import java.util.ArrayList;
import java.util.List;

public class LambdaForEach {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("test1");
        list.add("test2");
        list.add("test3");

        list.forEach(name -> System.out.println(name)); // name 相當於 collection 的每一個資料

    }

}
