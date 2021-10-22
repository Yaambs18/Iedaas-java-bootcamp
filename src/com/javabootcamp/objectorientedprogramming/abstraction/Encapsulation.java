package com.javabootcamp.objectorientedprogramming.abstraction;

class Employee1{
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Employee1 e = new Employee1();
        e.setName("Yansh");
        System.out.println(e.getName());
    }
}
