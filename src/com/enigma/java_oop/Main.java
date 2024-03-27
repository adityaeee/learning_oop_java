package com.enigma.java_oop;

public class Main {
    public static void main(String[] args) {
        Car supra = new Car("Toyota", "Black", 4);

        Ikan bandeng = new Ikan();
        Ikan tuna = new Ikan("Tuna");
        System.out.println(bandeng.print());

        Burung merpati = new Burung();
        Burung puyuh = new Burung("Puyuh");
        System.out.println(merpati.print());

        Mamalia monyet = new Mamalia();
        Mamalia paus = new Mamalia("Cetacea");
        paus.setMakanan("Ikan kecil & Planton");
        paus.setLebar(3_000);
        paus.setPanjang(25_000);
        paus.setBerat(2_000);
        paus.setBehavior("Berenang");
        System.out.println(paus.print());

        Mamalia gorila = new Mamalia("Primata");
        gorila.setMakanan("Buah-buahan");
        gorila.setLebar(100);
        gorila.setPanjang(400);
        gorila.setBerat(110);
        gorila.setBehavior("Memanjat");
        System.out.println(gorila.print());

        Mamalia kanguru = new Mamalia("Marsupial");
        kanguru.setMakanan("Buah-buahan");
        kanguru.setLebar(100);
        kanguru.setPanjang(400);
        kanguru.setBerat(110);
        kanguru.setBehavior("Memanjat");
        System.out.println(kanguru.print());

    }
}
