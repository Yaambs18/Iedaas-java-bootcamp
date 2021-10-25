package com.javabootcamp.multithreadingexamples;

class SleepMethodExample1 extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        SleepMethodExample1 t1=new SleepMethodExample1();
        SleepMethodExample1 t2=new SleepMethodExample1();

        t1.start();
        t2.start();
    }
}