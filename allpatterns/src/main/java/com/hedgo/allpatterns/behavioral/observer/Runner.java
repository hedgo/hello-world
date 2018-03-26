package com.hedgo.allpatterns.behavioral.observer;

import com.hedgo.allpatterns.creational.singleton.MySingleton;

public class Runner {

    public static void main(String[] args) {
        My1Subject my1Subject = new My1Subject();

        my1Subject.addObserver(new My1Observer());
        my1Subject.addObserver(new My2Observer());

        my1Subject.sthChanged();
    }
}
