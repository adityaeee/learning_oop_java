package com.enigma.polymorphism;

public class Block extends Rectangle {
    private Double height;

    Block (Double weight, Double length, Double height) {
        super(length, weight);
        this.height = height;
    }

//    @Override
//    public Double getArea() {
//        return 2 * (height*weight) +
//                (height*length) +
//                (weight*length);
//    }


    public void cobaa() {
        System.out.println("child");
    }
}
