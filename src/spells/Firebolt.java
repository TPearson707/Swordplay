package spells;

import characters.Character;

public class Firebolt implements Spell {
    private String name;
    private int manaCost;
    private int damage;

    public Firebolt() {
        this.name = "Firebolt";
        this.manaCost = 5; // Default mana cost
        this.damage = 12; // Default damage value
    }

    public Firebolt(String name, int manaCost, int damage) {
        if (manaCost <= 0 || damage <= 0) {
            throw new IllegalArgumentException("Mana cost and damage must be positive");
        }
        this.name = name;
        this.manaCost = manaCost;
        this.damage = damage;
    }

    @Override
    public void cast(Character target) {
        if (target != null && target.isAlive()) {
            System.out.println(name + " is cast on " + target.getName() + " for " + damage + " damage.");
            target.takeDamage(damage);
        } else {
            System.out.println("Target is not valid or is already defeated.");
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getManaCost() {
        return manaCost;
    }
    
}
