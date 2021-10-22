package com.JavaBootCamp.ObjectOrientedProgramming.Polymorphism;

public class InstanceOf {
    public static void main(String[] args){
        Dog1 d=new Dog1();
        System.out.println(d instanceof Animal);
        Dog1.method(d);
        Dog2 d2=null;
        System.out.println(d2 instanceof Dog2);
    }
}
class Animal{}
class Dog1 extends Animal {//Dog inherits Animal

    static void method(Animal a) {
        if (a instanceof Dog1) {
            Dog1 d = (Dog1) a;//downcasting
            System.out.println("ok downcasting performed");
        }
    }
}
class Dog2 {
}
