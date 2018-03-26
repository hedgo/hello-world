package com.hedgo.allpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class My1Subject implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer o : observers) {
            o.update();
        }
    }

    public void sthChanged(){
        System.out.println("sthChanged");
        notifyObserver();
    }
}
