package com.enigma.equalsAndHashcode;

import java.util.Objects;

public class Main {
    public static class Hero {
        public String name;

        public Hero(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Hero hero = (Hero) o;
            return Objects.equals(name, hero.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        //        @Override
//        public String toString() {
//            return "Hero{" +
//                    "name='" + name + '\'' +
//                    '}';
//        }
    }

    public static void main(String[] args) {
        Hero adit = new Hero("Aditya");
        Hero adit1 = new Hero("Rifky");

        System.out.println(adit + " >>>>>>");
        System.out.println(adit1 + " <<<<<<");

        System.out.println(adit.equals(adit1));
        System.out.println(adit.hashCode());
        System.out.println(adit1.hashCode());

        System.out.println("=================");
        System.out.println(Objects.hash("A"));
        System.out.println(Objects.hash("B"));
        System.out.println(Objects.hash("C"));
        System.out.println(Objects.hash("D"));

    }
}
