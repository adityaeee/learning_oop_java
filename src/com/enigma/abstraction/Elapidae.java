package com.enigma.abstraction;

public class Elapidae extends Animal implements Carnivore, Predator{
    Elapidae(String name, String scientificName) {
        super(name, scientificName);
    }


    public void eat(Animal animal) {
        System.out.println(super.name+"("+super.scientificName+") Memakan "+animal.name+"("+animal.scientificName+")");
    }

    public void hunt(Animal animal) {
        System.out.println("its show time "+animal.name);
    }
}
