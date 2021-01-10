package fr.saurin.designpatterns.observer.game.tech;

public interface PlayerObserver {
	void notifyDamage(int health, int damage);

	void notifyDead();
}
