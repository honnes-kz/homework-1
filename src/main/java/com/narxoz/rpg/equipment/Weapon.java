package com.narxoz.rpg.equipment;

public interface Weapon {

    int getDamage();
    String getWeaponType();
    String getWeaponName();
    String getWeaponInfo();

    void displayInfo();
}