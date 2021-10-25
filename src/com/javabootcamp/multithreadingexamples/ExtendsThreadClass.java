package com.javabootcamp.multithreadingexamples;

public class ExtendsThreadClass extends Thread{
    public void run(){
        System.out.println("thread is running...");
    }
    public static void main(String[] args){
        ExtendsThreadClass t1=new ExtendsThreadClass();
        t1.start();
    }
}
