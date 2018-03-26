package com.hedgo.allpatterns.creational.singleton;

public class MySingleton {


    private static MySingleton instance = new MySingleton();

    private MySingleton() {
    }

    public static MySingleton getInstance() {
        return instance;
    }

    public void showMessage(){
        System.out.printf("Hej");
    }

}
