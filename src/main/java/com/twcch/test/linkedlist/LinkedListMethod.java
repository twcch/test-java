package com.twcch.test.linkedlist;

import java.util.LinkedList;

public class LinkedListMethod {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1); // add elementor 時間複雜度 O(1)
        linkedList.add(2); // add elementor 時間複雜度 O(1)
        linkedList.add(1, 3); // add elementor 時間複雜度 O(N)

        System.out.println(linkedList.toString());

        int elementor = linkedList.get(2); // get(index) elementor

        System.out.println(elementor);

        int index = linkedList.indexOf(3); // return index 時間複雜度 O(N)

        System.out.println(index);

        linkedList.set(1, 99); // update elementor 時間複雜度 O(N)

        System.out.println(linkedList.toString());

        linkedList.remove(2); // delete elementor 時間複雜度 O(N)

        System.out.println(linkedList.toString());

        int length = linkedList.size(); // get size 時間複雜度 O(1)

        System.out.println(length);

    }

}
