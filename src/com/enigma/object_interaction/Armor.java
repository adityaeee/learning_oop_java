package com.enigma.player_03;

public class Armor {
    public String name;
    public Double defencePower;

    Armor(String name, Double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }


    public String display() {
        return  name + '\'' + ", Defence: " + defencePower;
    }
}
