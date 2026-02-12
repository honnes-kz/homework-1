package com.narxoz.rpg;

import com.narxoz.rpg.character.Warrior;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.IronSword;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.MedievalArmor;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Character & Equipment System ===\n");

        Warrior warrior = new Warrior("Thor");

        Weapon sword = new IronSword();
        Armor armor = new MedievalArmor();

        warrior.equipWeapon(sword.getWeaponName());
        warrior.equipArmor(armor.getArmorName());
        
        warrior.displayStats();
        warrior.displayEquipment();
        
        System.out.println("Weapon Info");
        sword.displayInfo();

        System.out.println("Armor Info");
        armor.getArmorInfo();

        System.out.println("\n=== Demo Complete ===");
    }
}