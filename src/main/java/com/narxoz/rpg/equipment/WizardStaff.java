package com.narxoz.rpg.equipment;

public class WizardStaff implements Weapon{
    
    private int damage;
    private String weaponType;
    private int manaBoost;

    public WizardStaff(){
        this.damage = 15;
        this.weaponType = "Staff";
        this.manaBoost = 40;
    }
    public int getDamage(){
        return damage;
    }
    public String getWeaponType(){
        return weaponType;
    }
    @Override
    public String getWeaponName(){  
        return "Wizard Staff";
    }
    public String getWeaponInfo(){
        return "Wizard Staff (Magic) - infused with magical energy";
    }
    public void displayInfo(){
        System.out.println("Weapon: " + getWeaponName());
        System.out.println("Damage: " + damage);
        System.out.println("ManaBoost" + manaBoost);
        System.out.println("Type: " + weaponType);
    }
}