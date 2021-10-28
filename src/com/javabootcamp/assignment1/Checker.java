package com.javabootcamp.assignment1;

import java.util.HashMap;
import java.util.Iterator;

class Checker {
    void checker (HashMap<Integer, Boolean> playersticket, String player) throws InterruptedException{
        Iterator<Integer> ticketkeys = playersticket.keySet().iterator();
        try {
            int count = 0;
            while (ticketkeys.hasNext()) {
                int key = ticketkeys.next();
                if (playersticket.get(key).equals(false)) {
                    count+=1;
                    throw new InterruptedException("Invalid housie");
                }
            }
            if(count==0){
                System.out.println("Congratulations....."+player+" Won!!!!");
            }
        }
        catch (NullPointerException e) {
            System.out.println("Wrong path provided.......");
        }
    }
}

