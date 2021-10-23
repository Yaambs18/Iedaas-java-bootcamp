package com.javabootcamp.exceptionhandling;

public class ExceptionPropagationExample {
    void m(){
        int data=50/0;
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handled");}
    }
    public static void main(String args[]){
        ExceptionPropagationExample obj=new ExceptionPropagationExample();
        obj.p();
        System.out.println("normal flow...");
    }
}
