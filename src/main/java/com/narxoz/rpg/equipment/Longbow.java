package com.narxoz.rpg.equipment;

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
    public void displayInfo(){

        System.out.println("Weapon: " + getWeaponName());
        System.out.println("Damage: " + damage);
        System.out.println("Range" + range);
        System.out.println("Type: " + weaponType);

    }
}