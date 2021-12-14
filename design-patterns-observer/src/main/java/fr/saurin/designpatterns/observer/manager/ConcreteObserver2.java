package fr.saurin.designpatterns.observer.manager;

import fr.saurin.designpatterns.observer.common.Observer;

public class ConcreteObserver2 implements Observer {

	public ConcreteObserver2() {
		ObserverManager.register(this);
	}

	@Override
	public void notifyObserver() {
		System.out.println("ConcreteObserver2 is notified !");
	}
}
