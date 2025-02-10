package player;

import combat.IDamageable;

public class Player implements IDamageable {
    private String name;
    private int health;
    private int attackPower;
    private int experience;

    public Player(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.experience = 0;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getAttackPower() { return attackPower; }
    public int getExperience() { return experience; }

    public void addExperience(int xp) {
        experience += xp;
        System.out.println(name + " получает " + xp + " опыта! (Текущий опыт: " + experience + ")");
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println(name + " был побеждён!");
        }
    }
}
