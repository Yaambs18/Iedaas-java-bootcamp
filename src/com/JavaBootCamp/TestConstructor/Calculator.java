package com.JavaBootCamp.TestConstructor;

public class Calculator {
    int instanceVariable;
    Calculator(){
        instanceVariable = 100;
    }
    public static void main(String[] args) {
        Calculator normalCalculator = new Calculator();
        Calculator scientificCalculator = new Calculator();

        System.out.println("Instance variable of normal calculator "+normalCalculator.instanceVariable);
        System.out.println("Instance variable of scientific calculator "+scientificCalculator.instanceVariable);


    }
}
