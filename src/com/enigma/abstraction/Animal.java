package com.enigma.abstraction;

public abstract class Animal extends LivingOrganism {
    protected String scientificName;
    protected String name;

    Animal(String name, String scientificName) {
        this.scientificName = scientificName;
        this.name = name;
    }

    public void eat(LivingOrganism organism){};
}
