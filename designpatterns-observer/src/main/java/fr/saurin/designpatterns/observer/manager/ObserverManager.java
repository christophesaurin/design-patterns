package fr.saurin.designpatterns.observer.manager;

import java.util.ArrayList;
import java.util.List;

public class ObserverManager {
	private static List<Observer> observers = new ArrayList<>();

	private ObserverManager() {
	}

	public static void register(final Observer monsterObserver) {
		observers.add(monsterObserver);
	}

	public static void unregister(final Observer monsterObserver) {
		observers.remove(monsterObserver);
	}

	public static void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.notifyObserver();
		}
	}
}
