package com.enigma.player_03;

public class Player {
    public String name;
    public Double health;
    public Integer level;
    public Weapon weapon;
    public Armor armor;

    Player(String name, Double health) {
        this.name = name;
        this.health = health;
        this.level = 1;
    }

    public void equipWeapon (Weapon weapon) {
        this.weapon = weapon;
    }

    public void equipArmor (Armor armor) {
        this.armor = armor;
    }

    public void attack (Player opponet) {
        double attackPower = this.weapon.attackPower;

        //panggil defence lawan
        opponet.defence(attackPower);
    }

    public void defence (Double attackPower) {

        if (this.health <=0 ){
            System.out.println(this.name+" telah mati");
        }else if(this.armor.defencePower <= 0.0) {
            this.health -= attackPower;
        } else {
            double loss = this.armor.defencePower - (attackPower * 0.8);
            this.health -= loss;
            this.health -= (attackPower * 0.2);
            if (loss <= 0) {
                this.armor.defencePower = 0.0;
            } else {
                this.armor.defencePower -= (attackPower * 0.8);
            }
        }
    }

    public void display() {
        System.out.println("Player {" +
                "\n\tName='" + name +
                "\n\tHealth=" + health +
                "\n\tWeapon = " + weapon.display() +
                "\n\tArmor = " + armor.display() +
                "\n}");
    }
}
