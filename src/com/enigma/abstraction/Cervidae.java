package com.enigma.abstraction;

public class Cervidae extends Animal implements Herbivore, Prey{
    Cervidae(String name, String scientificName) {
        super(name, scientificName);
    }

    public void eat(Plants plants) {
        System.out.println(super.name+"("+super.scientificName+") Memakan "+plants.name+"("+plants.scientificName+")");
    }

    @Override
    public void flee() {
        System.out.println(super.name +" Kaburrr duluu ada yang ngejarr");
    }
}
