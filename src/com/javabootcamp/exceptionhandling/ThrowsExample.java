package com.javabootcamp.exceptionhandling;
import java.io.*;

public class ThrowsExample {
    public static void method() throws IOException{

        throw new IOException("device error");
    }
    public static void main(String[] args){
        try
        {
            method();
        }
        catch (Exception e)
        {
            System.out.println("exception handled");
        }
        System.out.println("rest of the code...");
    }
}
