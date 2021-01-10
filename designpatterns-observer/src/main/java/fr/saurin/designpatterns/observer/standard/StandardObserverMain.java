package fr.saurin.designpatterns.observer.standard;

public class StandardObserverMain {

	public static void main(final String[] args) {
		ConcreteObserver1 concreteObserver1 = new ConcreteObserver1();
		ConcreteObserver2 concreteObserver2 = new ConcreteObserver2();

		Subject subject = new Subject();
		subject.addObserver(concreteObserver1);
		subject.addObserver(concreteObserver2);

		subject.compute();
	}
}
