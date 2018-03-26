package com.hedgo.allpatterns.behavioral.command;

public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("BUY");
    }

    public void sell() {
        System.out.println("SELL");
    }
}
