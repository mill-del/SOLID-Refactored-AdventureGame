package enemies;

import combat.IAttackable;
import combat.IDamageable;

public abstract class Enemy implements IAttackable, IDamageable {
    protected String name;
    protected int health;
    protected int attackPower;

    public Enemy(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getAttackPower() { return attackPower; }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println(name + " побежден!");
        }
    }

    @Override
    public void attack(IDamageable target) {
        target.takeDamage(attackPower);
        System.out.println(name + " атакует и наносит " + attackPower + " урона!");
    }
}
