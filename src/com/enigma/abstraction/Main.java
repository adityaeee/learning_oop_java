package com.enigma.abstraction;

public class Main {
    public static void main(String[] args) {
        Felidae lion = new Felidae("Singa", "Phantera leo");
        Elapidae snack = new Elapidae("Cobra", "Naja sp.");
        Cervidae deer = new Cervidae("Rusa", "Cervus canadensis");
        Poaceae grasses = new Poaceae("Rumput", "Cynodon dactylon");

        lion.eat(deer);
        snack.eat(deer);
        deer.eat(grasses);
        grasses.photosynthesis();

        Animal[] animals = new Animal[] {lion, snack, deer};
        filterEat(animals);
    }

    static void filterEat (Animal[] animals) {
        for (Animal animal : animals) {
            if (animal instanceof Carnivore) {
                System.out.println(animal.name + " adalah Karnivora");
            }else {
                System.out.println(animal.name + " adalah Herbivora");
            }
        }
    }
}
