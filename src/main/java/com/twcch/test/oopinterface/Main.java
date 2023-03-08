package com.twcch.test.oopinterface;

public class Main {

    public static void main(String[] args) {

        File file = new Multimedia();
        System.out.println(file.getFileName());

    }

    public void process(File file, Network net) {

        net.connect();
        net.transfer(file.getFileName());
        net.disconnect();

    }

}
