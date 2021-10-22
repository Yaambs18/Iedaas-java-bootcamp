package com.javabootcamp.objectorientedprogramming.testconstructor;

public class CopyConstructor {
    int num;
    CopyConstructor(int value){
        num = value;
    }
    CopyConstructor(CopyConstructor c){
        num = c.num;
    }
    public static void main(String[] args) {
        CopyConstructor obj1 = new CopyConstructor(10);
        CopyConstructor obj2 = new CopyConstructor(obj1);

        System.out.println("Instance variable of normal calculator "+obj1.num);
        System.out.println("Instance variable of scientific calculator "+obj2.num);


    }
}
