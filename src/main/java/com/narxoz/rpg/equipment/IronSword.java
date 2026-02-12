package com.narxoz.rpg.equipment;

public class IronSword implements Weapon {

    private int damage;
    private String weaponType;

    public IronSword() {
        this.damage = 25;
        this.weaponType = "Sword";
    }

    public int getDamage() {
        return damage;
    }
    @Override
    public String getWeaponName() {
        return "Iron Sword ";
    }
    public String getWeaponType(){
        return "Melee";
    }
    public String getWeaponInfo() {
        return "Iron Sword (Medieval) - A sturdy blade forged from iron";
    }

    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponName());
        System.out.println("Damage: " + damage);
        System.out.println("Type: " + weaponType);
    }
}