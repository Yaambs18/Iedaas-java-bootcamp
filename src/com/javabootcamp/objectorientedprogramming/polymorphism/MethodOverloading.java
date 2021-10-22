package com.javabootcamp.objectorientedprogramming.polymorphism;

public class MethodOverloading {
    public void area(int b, int h){
        System.out.println("Area of triangle : "+(0.5*b*h));
    }
    public void area(int r){
        System.out.println("Area of circle : "+(3.14*r*r));
    }

    public static void main(String[] args) {
        MethodOverloading a = new MethodOverloading();
        a.area(7);
        a.area(14,2);
    }
}
