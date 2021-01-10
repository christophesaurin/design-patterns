package fr.saurin.designpatterns.observer.game.tech;

import java.util.ArrayList;
import java.util.List;

public class PlayerObserverManager {
	private static List<PlayerObserver> playerObservers = new ArrayList<>();

	public static void register(final PlayerObserver playerObserver) {
		playerObservers.add(playerObserver);
	}

	public static void unregister(final PlayerObserver playerObserver) {
		playerObservers.remove(playerObserver);
	}

	public static void notifyDamage(final int health, final int damage) {
		for (PlayerObserver playerObserver : playerObservers) {
			playerObserver.notifyDamage(health, damage);
		}
	}

	public static void notifyDead() {
		for (PlayerObserver playerObserver : playerObservers) {
			playerObserver.notifyDead();
		}
	}
}
