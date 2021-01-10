package fr.saurin.designpatterns.observer.game;

import fr.saurin.designpatterns.observer.game.observer.GameManager;
import fr.saurin.designpatterns.observer.game.observer.HudManager;
import fr.saurin.designpatterns.observer.game.observer.SoundManager;
import fr.saurin.designpatterns.observer.game.subject.Monster;
import fr.saurin.designpatterns.observer.game.subject.Player;

public class GameObserverMain {
	public static void main(final String[] args) {
		Player p1 = new Player(100);

		Monster monster1 = new Monster(10);
		Monster monster2 = new Monster(20);

		SoundManager soundManager = new SoundManager();
		HudManager hudManager = new HudManager();
		GameManager gameManager = new GameManager();

		for (int i = 0; i < 6; i++) {
			System.out.println("### ROUND ###");
			monster1.attack(p1);
			monster2.attack(p1);
		}
	}
}
