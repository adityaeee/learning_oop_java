package com.enigma.java_oop;
//4 Pilar OOP (Encapsulation, Inheritance, Polymorphism, Abstraction)
public class Car {
    public String brand;
    public String color;
    public Integer wheel;
    private Integer fuel;

    Car (String brand, String color, Integer wheel){
        this.brand = brand;
        this.color = color;
        this.wheel = wheel;
        this.fuel = 0;
    }

    Car (){}

    //Setter
    public void setFuel(Integer value){
        this.fuel = value+5;
    }

    //Getter
    public Integer getFuel() {
        return fuel-5;
    }

    public String print() {
        return "Car {" +
                "\n\tBrand = " +this.brand +
                "\n\tColor = " +this.color +
                "\n\tWheel = " +this.wheel +
                "\n\tFuel = " +this.fuel +
                "\n\t} ";
    }
}
