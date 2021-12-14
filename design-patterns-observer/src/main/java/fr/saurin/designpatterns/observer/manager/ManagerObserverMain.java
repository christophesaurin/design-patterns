package fr.saurin.designpatterns.observer.manager;

import fr.saurin.designpatterns.observer.common.Observer;

public class ManagerObserverMain {

	public static void main(final String[] args) {
		Observer concreteObserver1 = new ConcreteObserver1();
		Observer concreteObserver2 = new ConcreteObserver2();

		Subject subject = new Subject();
		subject.compute();
	}
}
