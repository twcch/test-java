package com.twcch.test.io;

import javax.swing.*;

public class JOptionPaneIO {

    public static void main(String[] args) {

        String str = JOptionPane.showInputDialog("請輸入數值:");
        int i = Integer.parseInt(str);
        i = i * 2;

        System.out.println(i);

    }

}
