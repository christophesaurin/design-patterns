package fr.saurin.designpatterns.observer.standard;

import fr.saurin.designpatterns.observer.common.Observer;

public interface Observable {
    void register(final Observer observer);

    void unregister(final Observer observer);

    void notifyObservers();
}
