package combat;

import player.Player;
import enemies.Enemy;

public class CombatManager {
    public void engageCombat(Player player, Enemy enemy) {
        System.out.println(player.getName() + " сражается с " + enemy.getName());

        while (player.getHealth() > 0 && enemy.getHealth() > 0) {
            enemy.attack(player);
            if (player.getHealth() > 0) {
                player.takeDamage(enemy.getAttackPower());
            }
        }

        if (player.getHealth() > 0) {
            System.out.println(player.getName() + " победил!");
        }
    }
}
