package com.enigma.abstraction;

public class Plants extends LivingOrganism {
    protected String scientificName;
    protected String name;

    Plants (String name, String scientificName) {
        this.scientificName = scientificName;
        this.name = name;
    }

    public void photosynthesis() {
        System.out.println("Light and chlorophyl to oxygen, take it");
    }
}
