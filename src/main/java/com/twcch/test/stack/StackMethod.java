package com.twcch.test.stack;

import java.util.Stack;

public class StackMethod {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.peek()); // get stack top elementor
        System.out.println(stack.pop()); // delete stack top elementor and return
        System.out.println(stack.peek()); // get stack top elementor
        System.out.println(stack.size()); // get stack size
        System.out.println(stack.isEmpty()); // get boolean stack == null

        /*
         * traversal stack (邊刪除邊遍歷)
         */
        while (!stack.isEmpty()) {
            String str = stack.pop();
            System.out.println(str);
        }

    }

}
