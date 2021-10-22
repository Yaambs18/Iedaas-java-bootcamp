package com.JavaBootCamp.ObjectOrientedProgramming.Abstraction;

interface Printable1{
    void print();
}
interface Showable1 extends Printable{
    void show();
}
class TestInterface4 implements Showable{
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}
}
public class InterfaceInheritance {
    public static void main(String[] args){
        TestInterface4 obj = new TestInterface4();
        obj.print();
        obj.show();
    }
}
