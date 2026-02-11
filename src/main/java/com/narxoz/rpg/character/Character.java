package com.narxoz.rpg.character;

public interface Character {

    String getName();
    int getHealth();
    int getMana();
    int getStrength();
    int getIntelligence();

    void displayStats();
    void useSpecialAbility();

    void equipWeapon(String weaponName);
    void equipArmor(String armor);
    void displayEquipment();
}
