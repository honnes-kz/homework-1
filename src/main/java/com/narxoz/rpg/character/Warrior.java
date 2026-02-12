package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;

public class Warrior implements Character {

    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;

    private String weapon;
    private String armor;

    public Warrior(String name) {
        this.name = name;
        this.health = 150;
        this.mana = 30;
        this.strength = 80;
        this.intelligence = 20;

        this.weapon = "no weapon";
        this.armor = "no armor";
    }

    public String getName() {
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getMana(){
        return mana;
    }
    public int getStrength(){
        return strength;
    }
    public int getIntelligence(){
        return intelligence;
    }

    public void displayStats() {
        System.out.println("=== " + name + " (Warrior) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    public void useSpecialAbility() {
        System.out.println(name + " uses BERSERKER RAGE! Strength temporarily increased!");
    }

    public void equipWeapon(String weapon){
        this.weapon = weapon;
        System.out.println(name + "equipped weapon" + weapon);
    }
    public void equipArmor(String armor){
        this.armor = armor;
        System.out.println(name + "equipped armor" + armor);
    }
    public void displayEquipment(){
        System.out.println("Weapon:" + weapon);
        System.out.println("Armor:" + armor);
    }
}