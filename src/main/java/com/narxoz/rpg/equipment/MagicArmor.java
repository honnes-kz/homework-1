package com.narxoz.rpg.equipment;

public class MagicArmor implements Armor{
    
    private String name;
    private int defense;
    private String type;

    public MagicArmor(){
        this.name = "Mystic Rode";
        this.defense = 20;
        this.type = "Rode";
    }

    public int getDefense(){
        return defense;
    }
    public String getArmorType(){
        return type;
    }
    public String getArmorName(){
        return name;
    }
    public String getArmorInfo(){
        return name + "type:" + type + "defense" +defense; 
    }
}