package fr.saurin.designpatterns.observer.game.tech;

import java.util.ArrayList;
import java.util.List;

public class MonsterObserverManager {
	private static List<MonsterObserver> monsterObservers = new ArrayList<>();

	public static void register(final MonsterObserver monsterObserver) {
		monsterObservers.add(monsterObserver);
	}

	public static void unregister(final MonsterObserver monsterObserver) {
		monsterObservers.remove(monsterObserver);
	}

	public static void notifyDamage(final int damage) {
		for (MonsterObserver monsterObserver : monsterObservers) {
			monsterObserver.notifyAttack(damage);
		}
	}

}
