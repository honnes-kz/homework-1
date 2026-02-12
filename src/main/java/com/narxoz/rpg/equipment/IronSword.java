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

    public String getWeaponInfo() {
        return "Iron Sword (Medieval) - A sturdy blade forged from iron";
    }

    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponInfo());
        System.out.println("Damage: " + damage);
        System.out.println("Type: " + weaponType);
    }
}
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
    public String getWeaponName(){  
        return "Wizard Staff";
    }
    public String getWeaponInfo(){
        return "Wizard Staff (Magic) - infused with magical energy";
    }
    public void displayInfo(){
        System.out.println("Weapon: " + getWeaponInfo());
        System.out.println("Damage: " + damage);
        System.out.println("ManaBoost" + manaBoost);
        System.out.println("Type: " + weaponType);
    }
}
public class Longbow implements Weapon{
    
    private int damage;
    private String weaponType;
    private int range;

    public  Longbow(){
        this.damage = 20;
        this.weaponType = "Bow";
        this.range = 100;
    }
    public int getDamage(){
        return damage;
    }
    public String getWeaponType(){
        return weaponType;
    }
    public String getWeaponName(){
        return "LongBow";
    }
    public String getWeaponInfo(){
        return "LongBow (Ranger) - A precise ranged weapon";
    }
    public displayInfo(){
        System.out.println("Weapon: " + getWeaponInfo);
        System.out.println("Damage: " + damage);
        System.out.println("Range" + range);
        System.out.println("Type: " + weaponType);
    }
}