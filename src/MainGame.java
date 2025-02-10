import player.Player;
import enemies.Zombie;
import combat.CombatManager;
import level.LevelManager;

public class MainGame {
    public static void main(String[] args) {
        Player player = new Player("Malika", 100, 15);
        Zombie enemy = new Zombie(50, 10);

        CombatManager combatManager = new CombatManager();
        LevelManager levelManager = new LevelManager();

        combatManager.engageCombat(player, enemy);
        levelManager.awardExperience(player, 20);
    }
}
