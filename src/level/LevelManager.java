package level;

import player.Player;

public class LevelManager {
    public void awardExperience(Player player, int xp) {
        System.out.println("Игрок получает " + xp + " опыта!");
        player.addExperience(xp);
    }
}
