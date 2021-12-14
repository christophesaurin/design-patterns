package fr.saurin.designpatterns.observer.standard;

import fr.saurin.designpatterns.observer.common.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements Observable {
    final private List<Observer> observers = new ArrayList<>();

    public void register(final Observer observer) {
        observers.add(observer);
    }

    public void unregister(final Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.notifyObserver();
        }
    }

    public void compute() {
        System.out.println("Start compute");
        notifyObservers();
        System.out.println("End compute");
    }
}
