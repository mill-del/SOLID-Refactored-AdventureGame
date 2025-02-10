package items;

import player.Player;

public class HealthElixir extends ItemManager {
    public HealthElixir() {
        super("Эликсир здоровья");
    }

    public void use(Player player) {
        System.out.println("Игрок выпил " + name + " и восстановил здоровье!");
    }
}
