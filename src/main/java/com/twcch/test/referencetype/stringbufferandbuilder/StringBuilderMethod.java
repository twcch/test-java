package com.twcch.test.referencetype.stringbufferandbuilder;

public class StringBuilderMethod {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello").append("Jim");
        stringBuilder.insert(stringBuilder.length(), "!");

        System.out.println(stringBuilder);

        stringBuilder.delete(0, stringBuilder.length());
        stringBuilder.append("A");

        System.out.println(stringBuilder);

    }

}
