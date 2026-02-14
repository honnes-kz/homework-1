package com.narxoz.rpg;

import com.narxoz.rpg.character.*;
import com.narxoz.rpg.equipment.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Character & Equipment System ===\n");

        Warrior warrior = new Warrior("Thor");
        Mage mage = new Mage("Merlin");
        Assassin assassin = new Assassin("Ezio");

        Weapon sword = new IronSword();
        Weapon staff = new WizardStaff();

        Armor medievalArmor = new MedievalArmor();
        Armor magicArmor = new MagicArmor();

        warrior.equipWeapon(sword.getWeaponName());
        warrior.equipArmor(medievalArmor.getArmorName());

        mage.equipWeapon(staff.getWeaponName());
        mage.equipArmor(magicArmor.getArmorName());

        assassin.equipWeapon(sword.getWeaponName());
        assassin.equipArmor(medievalArmor.getArmorName());

        System.out.println();

        warrior.displayStats();
        warrior.displayEquipment();
        warrior.useSpecialAbility();

        System.out.println();

        mage.displayStats();
        mage.displayEquipment();
        mage.useSpecialAbility();

        System.out.println();

        assassin.displayStats();
        assassin.displayEquipment();
        assassin.useSpecialAbility();

        System.out.println("UML Design");
        System.out.println("Character->Assassin,Mage,Warrior");
        System.out.println("Armor->MagicArmor,MedivalArmor");
        System.out.println("Weapon->WizardStaff,IronSword,Longbow");


        System.out.println("\n=== Demo Complete ===");
    }
}