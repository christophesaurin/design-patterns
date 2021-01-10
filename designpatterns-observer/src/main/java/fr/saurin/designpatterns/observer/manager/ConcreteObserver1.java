package fr.saurin.designpatterns.observer.manager;

public class ConcreteObserver1 implements Observer {
	public ConcreteObserver1() {
		ObserverManager.register(this);
	}

	@Override
	public void notifyObserver() {
		System.out.println("ConcreteObserver1 is notified !");
	}
}
