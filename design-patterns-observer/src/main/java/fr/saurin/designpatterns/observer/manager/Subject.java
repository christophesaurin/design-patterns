package fr.saurin.designpatterns.observer.manager;

public class Subject {
    public void compute() {
        System.out.println("Start compute");
        ObserverManager.notifyObservers();
        System.out.println("End compute");
    }
}
