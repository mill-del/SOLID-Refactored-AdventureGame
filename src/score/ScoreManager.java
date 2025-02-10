package score;

import player.Player;

public class ScoreManager {
    public void displayScore(Player player) {
        System.out.println("Игрок: " + player.getName() + ", Опыт: " + player.getExperience());
    }
}
