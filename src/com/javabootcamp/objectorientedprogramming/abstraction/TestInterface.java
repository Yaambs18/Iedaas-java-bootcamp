package com.javabootcamp.objectorientedprogramming.abstraction;

interface Money{
    void Operation();
}
class Debit implements Money{
    public void Operation(){
        System.out.println("Debiting money.");
    }
}
class Credit implements  Money{
    public void Operation(){
        System.out.println("Amount crediting");
    }
}

public class TestInterface {
    public static void main(String[] args) {
        Money d = new Debit();
        d.Operation();
    }
}