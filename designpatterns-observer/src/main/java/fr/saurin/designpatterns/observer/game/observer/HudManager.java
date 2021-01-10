package fr.saurin.designpatterns.observer.game.observer;

import fr.saurin.designpatterns.observer.game.tech.PlayerObserver;
import fr.saurin.designpatterns.observer.game.tech.PlayerObserverManager;

public class HudManager implements PlayerObserver {

	public HudManager() {
		PlayerObserverManager.register(this);
	}

	@Override
	public void notifyDamage(final int health, final int damage) {
		System.out.println("Update health bar");
		System.out.println("Flash damage");
	}

	@Override
	public void notifyDead() {
		System.out.println("Hide health bar");
		System.out.println("Vous êtes mort !!!");
	}
}
