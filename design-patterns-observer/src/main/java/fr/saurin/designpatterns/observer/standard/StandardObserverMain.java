package fr.saurin.designpatterns.observer.standard;

import fr.saurin.designpatterns.observer.common.Observer;

public class StandardObserverMain {

	public static void main(final String[] args) {
		Subject subject = new Subject();

		Observer observer1 = new ConcreteObserver1();
		subject.register(observer1);
		Observer observer2 = new ConcreteObserver2();
		subject.register(observer2);

		subject.compute();
	}
}
