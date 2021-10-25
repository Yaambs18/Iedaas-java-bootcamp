package com.javabootcamp.multithreadingexamples;

public class ImplementsRunnableInterface implements Runnable{
    public void run(){
        System.out.println("thread is running...");
    }

    public static void main(String[] args){
        ImplementsRunnableInterface m1=new ImplementsRunnableInterface();
        Thread t1 =new Thread(m1);
        t1.start();
    }
}
