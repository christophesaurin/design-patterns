package fr.saurin.designpatterns.observer.game.subject;

import static fr.saurin.designpatterns.observer.game.tech.PlayerObserverManager.notifyDamage;
import static fr.saurin.designpatterns.observer.game.tech.PlayerObserverManager.notifyDead;

public class Player {

	private boolean isAlive = true;

	private int health;

	public Player(final int health) {
		this.health = health;
	}

	public void damage(final int damage) {
		if (damage > 0 && !isAlive) {
			return;
		}
		health -= damage;
		isAlive = health > 0;
		if (isAlive) {
			notifyDamage(health, damage);
		} else {
			health = 0;
			notifyDead();
		}
	}

	@Override
	public String toString() {
		return String.format("Subject(isAlive = %s, health = %s)", isAlive, health);
	}

}
