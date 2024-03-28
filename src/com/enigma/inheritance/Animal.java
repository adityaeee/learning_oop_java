package com.enigma.inheritance;

public class Animal {
    protected String name;
    protected Integer legs;
    protected Boolean wings;
    protected Boolean fin;

    Animal(String name, Integer legs,Boolean wings, Boolean fin){
        this.name = name;
        this.legs = legs;
        this.wings = wings;
        this.fin = fin;
    }

    public void makeSound() {
        System.out.println("Meong");
    }

}
