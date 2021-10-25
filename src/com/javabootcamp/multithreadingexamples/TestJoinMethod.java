package com.javabootcamp.multithreadingexamples;


class TestJoinMethod extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(500);
            }catch(Exception e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        TestJoinMethod t1=new TestJoinMethod();
        TestJoinMethod t2=new TestJoinMethod();
        TestJoinMethod t3=new TestJoinMethod();
        System.out.println("Name of t1:"+t1.getName());
        System.out.println("Name of t2:"+t2.getName());
        System.out.println("id of t1:"+t1.getId());

        t1.setName("Yansh");
        System.out.println("Name of t1:"+t1.getName());

        t1.start();

        try{
            t1.join(1000);
        }catch(Exception e){System.out.println(e);}

        t2.start();
        t3.start();
    }
}