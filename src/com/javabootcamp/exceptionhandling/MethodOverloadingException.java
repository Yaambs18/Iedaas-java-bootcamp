package com.javabootcamp.exceptionhandling;
import java.io.*;
class Parent{

    void msg() {
        System.out.println("parent method");
    }
}
public class MethodOverloadingException extends Parent{

    void msg() throws ArithmeticException{
        System.out.println("TestExceptionChild");
    }

    public static void main(String args[]) {
        Parent p = new MethodOverloadingException();
        p.msg();
    }
}
