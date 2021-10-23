package com.javabootcamp.exceptionhandling;

public class SampleExceptionExample {
    public static void main(String[] args) {
        try{
            int data = 100/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        try{
            String name=null;
            System.out.println(name.length());
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        try{
            String name = "Yansh";
            int i=Integer.parseInt(name);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        try{
            int[] arr = {1,2,3,};
            System.out.println(arr[4]);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("Rest code gets execute......");
    }
}
