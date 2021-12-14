package fr.saurin.designpatterns.observer.game.observer;

import fr.saurin.designpatterns.observer.game.tech.PlayerObserver;
import fr.saurin.designpatterns.observer.game.tech.PlayerObserverManager;

public class GameManager implements PlayerObserver {

    public GameManager() {
        PlayerObserverManager.register(this);
    }

    @Override
    public void notifyDamage(final int health, final int damage) {
        // RAS
    }

    @Override
    public void notifyDead() {
        System.out.println("Partie terminée !!!");
    }
}
