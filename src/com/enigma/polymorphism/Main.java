package com.enigma.polymorphism;

public class Main {
    public static void main(String[] args) {
        Block blok = new Block(20.0,30.0,40.0);
        System.out.println(blok.getArea());
        blok.cobaa();

        Rectangle blok2 = new Block(20.0,30.0,40.0);
//        blok2.cobaa(); // error karna gakbisa membuat method baru
    }
}
