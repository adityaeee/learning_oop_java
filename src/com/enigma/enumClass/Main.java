package com.enigma.enumClass;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Gender.MALE);
        System.out.println(Gender.FEMALE.description);

//        1. method static yang nempel di classnya
//        values() untuk menampilkan seluruh data di dalam enum dalam bentuk array
        System.out.println(Arrays.toString(Gender.values()));

//        valuesOf() mencari data enum dari valuenya yang berbentuk string
        Direction north = Direction.valueOf("NORTH");
        System.out.println(north);

//        1. method non-static yang nempel di object
//        name(), menampilkan/mengubah value dari enum ke string
        System.out.println(north.name());
        if (north.name() instanceof String) {
            System.out.println("Benarrrr");
        }

//        ordinal() menampilkan index dari enum
//        System.out.println(north.ordinal());
//        System.out.println(Direction.values()[2]);
        System.out.println(Direction.NORTH.turnLeft());
    }
}
