package com.javabootcamp.exceptionhandling;

import java.io.*;
class Parent2{
    void msg() throws Exception {
        System.out.println("parent method");
    }
}

public class MethodOverloadingException2 extends Parent2{
    void msg()throws Exception {
        System.out.println("child method");
    }

    public static void main(String args[]){
        Parent2 p = new MethodOverloadingException2();

        try {
            p.msg();
        }
        catch(Exception e) {}
    }
}
