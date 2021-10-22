package com.JavaBootCamp.ObjectOrientedProgramming.TestConstructor;

public class ConstructorOverloading {
    int instanceVariable;
    String type;
    ConstructorOverloading(int value, String s){
        instanceVariable = value;
        type = s;
    }
    public static void main(String[] args) {
        ConstructorOverloading normalCalculator = new ConstructorOverloading(10, "normal");
        ConstructorOverloading scientificCalculator = new ConstructorOverloading(20, "scientific");

        System.out.println("Instance variable of normal calculator "+normalCalculator.instanceVariable);
        System.out.println("Instance variable of scientific calculator "+scientificCalculator.type);


    }
}
