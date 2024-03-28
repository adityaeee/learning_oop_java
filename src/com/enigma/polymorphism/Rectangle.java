package com.enigma.polymorphism;

public class Rectangle {
    protected Double length;
    protected Double weight;

    Rectangle(Double length, Double weight) {
        this.length = length;
        this.weight = weight;
    }

    public Double getArea () {
        return this.length * this.weight;
    }

    public void coba(){
        System.out.println("parent");
    }

}
