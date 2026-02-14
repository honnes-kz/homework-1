package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;

public class Mage implements Character {

    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;

    private String weapon = "no weapon";
    private String armor = "no armor";

    public Mage(String name) {
        this.name = name;
        this.health = 80;
        this.mana = 150;
        this.strength = 20;
        this.intelligence = 90;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getMana() { return mana; }
    public int getStrength() { return strength; }
    public int getIntelligence() { return intelligence; }

    public void displayStats() {
        System.out.println("=== " + name + " (Mage) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    public void useSpecialAbility() {
        System.out.println(name + " casts FIREBALL!");
    }

    public void equipWeapon(String weapon) {
        this.weapon = weapon;
        System.out.println(name + " equipped weapon: " + weapon);
    }

    public void equipArmor(String armor) {
        this.armor = armor;
        System.out.println(name + " equipped armor: " + armor);
    }

    public void displayEquipment() {
        System.out.println("Weapon: " + weapon);
        System.out.println("Armor: " + armor);
    }
}
