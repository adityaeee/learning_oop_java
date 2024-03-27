package com.enigma.player_03;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Aditya", 100.0);
        Armor armor1 = new Armor("Zirah Kulit", 85.0);
        Weapon weapon1 = new Weapon("Pedang Besi", 23.4);

        player1.equipArmor(armor1);
        player1.equipWeapon(weapon1);
        player1.display();

        Player player2 = new Player("Rifky", 120.0);
        Armor armor2 = new Armor("Zirah Besi", 160.0);
        Weapon weapon2 = new Weapon("Pedang Kayu", 16.7);

        player2.equipArmor(armor2);
        player2.equipWeapon(weapon2);
        player2.display();

        System.out.println("\n\t==========================");
        player1.attack(player2);
        player2.display();

    }
}
