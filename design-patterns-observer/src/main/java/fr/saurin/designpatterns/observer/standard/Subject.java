package fr.saurin.designpatterns.observer.standard;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> observers = new ArrayList<>();

	public void addObserver(final Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(final Observer observer) {
		observers.remove(observer);
	}

	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.notifyObserver();
		}
	}

	public void compute() {
		System.out.println("Start compute");
		notifyAllObservers();
		System.out.println("End compute");
	}
}
