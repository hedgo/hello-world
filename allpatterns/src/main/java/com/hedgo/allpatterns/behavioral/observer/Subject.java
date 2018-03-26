package com.hedgo.allpatterns.behavioral.observer;

public interface Subject {//do niej dodajemy obserwatorow
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
