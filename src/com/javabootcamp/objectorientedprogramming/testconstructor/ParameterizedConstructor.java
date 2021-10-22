package com.javabootcamp.objectorientedprogramming.testconstructor;

public class ParameterizedConstructor {
    int instanceVariable;
    ParameterizedConstructor(int value){
        instanceVariable = value;
    }
    public static void main(String[] args) {
        ParameterizedConstructor normalCalculator = new ParameterizedConstructor(10);
        ParameterizedConstructor scientificCalculator = new ParameterizedConstructor(20);

        System.out.println("Instance variable of normal calculator "+normalCalculator.instanceVariable);
        System.out.println("Instance variable of scientific calculator "+scientificCalculator.instanceVariable);


    }
}
