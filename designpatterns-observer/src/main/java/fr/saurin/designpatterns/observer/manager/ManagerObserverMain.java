package fr.saurin.designpatterns.observer.manager;

public class ManagerObserverMain {

	public static void main(final String[] args) {
		ConcreteObserver1 concreteObserver1 = new ConcreteObserver1();
		ConcreteObserver2 concreteObserver2 = new ConcreteObserver2();

		Subject subject = new Subject();

		subject.compute();
	}
}
