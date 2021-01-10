package fr.saurin.designpatterns.observer.game.subject;

import fr.saurin.designpatterns.observer.game.tech.MonsterObserverManager;

public class Monster {

	private int damage;

	public Monster(final int damage) {
		this.damage = damage;
	}

	public void attack(final Player player) {
		MonsterObserverManager.notifyDamage(damage);
		player.damage(damage);
	}
}
