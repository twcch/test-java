package com.twcch.test.oopgenerics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Foo<String> foo1 = new Foo<String>();
        foo1.setFoo("Test");
        System.out.println(foo1.getFoo());

        Foo<Double> foo2 = new Foo<Double>();
        foo2.setFoo(1.34);
        System.out.println(foo2.getFoo());

        /*
         * 通配字元 Wildcard
         */
        Foo<? extends List> foos = new Foo<ArrayList>(); // 同 Foo<? super ArrayList> foos = new Foo<List>();

    }

}
