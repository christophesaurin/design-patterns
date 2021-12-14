package fr.saurin.designpatterns.observer.manager;

import fr.saurin.designpatterns.observer.common.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverManager {
    private final static List<Observer> observers = new ArrayList<>();

    private ObserverManager() {
    }

    public static void register(final Observer observer) {
        observers.add(observer);
    }

    public static void unregister(final Observer observer) {
        observers.remove(observer);
    }

    public static void notifyObservers() {
        observers.forEach(Observer::notifyObserver);
    }
}
