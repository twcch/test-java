package com.twcch.test.oopabstract;

public class Main {

    public static void main(String[] args) {

        Network network = new FTP();
        network.transfer("ZIP");

    }

}
