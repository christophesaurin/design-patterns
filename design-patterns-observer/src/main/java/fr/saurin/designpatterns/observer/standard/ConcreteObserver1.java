package fr.saurin.designpatterns.observer.standard;

public class ConcreteObserver1 implements Observer {
	@Override
	public void notifyObserver() {
		System.out.println("ConcreteObserver1 is notified !");
	}
}
