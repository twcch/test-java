package com.twcch.test.oopabstract;

public abstract class Network {

    public void transfer(String fileName) {

        connect();
        System.out.println("Transfer " + fileName);
        disconnect();

    }

    public abstract void connect();
    public abstract void disconnect();

}
