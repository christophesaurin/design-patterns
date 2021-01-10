package fr.saurin.designpatterns.observer.standard;

public class ConcreteObserver2 implements Observer {

	@Override
	public void notifyObserver() {
		System.out.println("ConcreteObserver2 is notified !");
	}
}
