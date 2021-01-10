package fr.saurin.designpatterns.observer.game.observer;

import fr.saurin.designpatterns.observer.game.tech.MonsterObserver;
import fr.saurin.designpatterns.observer.game.tech.MonsterObserverManager;
import fr.saurin.designpatterns.observer.game.tech.PlayerObserver;
import fr.saurin.designpatterns.observer.game.tech.PlayerObserverManager;

public class SoundManager implements PlayerObserver, MonsterObserver {

	public SoundManager() {
		PlayerObserverManager.register(this);
		MonsterObserverManager.register(this);
	}

	@Override
	public void notifyDamage(final int health, final int damage) {
		System.out.println("play player damage sound ...");
	}

	@Override
	public void notifyDead() {
		System.out.println("play player dead sound ...");
	}

	@Override
	public void notifyAttack(final int damage) {
		System.out.println("play monster attack sound ...");
	}
}
