package com.javabootcamp.objectorientedprogramming.testconstructor;

public class ConstructorChaining {
    String sName;
    int sMarks;

    ConstructorChaining(){
        this("Meghan");
    }
    ConstructorChaining(String name){
        this(name, 70);
    }
    ConstructorChaining(String name, int mark){
        this.sName = name;
        this.sMarks = mark;
    }
    void display(){
        System.out.println("Student name: "+ sName);
        System.out.println("Student marks: "+ sMarks);
    }

    public static void main(String[] args) {
        ConstructorChaining s = new ConstructorChaining();
        s.display();
    }
}
