package com.enigma.player_03;

import javax.xml.namespace.QName;

public class Weapon {
    public String name;
    public Double attackPower;

    Weapon (String name, Double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    public String display() {
        return  name + '\'' + ", Attack: " + attackPower;
    }
}
