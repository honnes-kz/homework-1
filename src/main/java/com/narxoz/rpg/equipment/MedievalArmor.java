package com.narxoz.rpg.equipment;

public class MedievalArmor implements Armor{

    private String name;
    private int defense;
    private String type;

    public MedievalArmor(){
        this.name = "Steel Plate Armor";
        this.defense = 50;
        this.type = "Heavy";
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
        return name + "type:" + type + "defense" + defense;
    }
}