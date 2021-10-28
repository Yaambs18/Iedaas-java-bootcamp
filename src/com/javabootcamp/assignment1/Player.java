package com.javabootcamp.assignment1;

import java.util.HashMap;
import java.util.Iterator;

public class Player implements Runnable {

    private HashMap<Integer, Boolean> ticket;

    Player() {
        this.ticket = new HashMap<>();
    }

    HashMap<Integer, Boolean> gettickets() {
        return ticket;
    }

    void ticketgenerator() {
        int random_number;
        int min = 1, max = 90;
        while (ticket.size() != 15) {
            random_number = (int) (Math.random() * (max - min + 1) + min);
            ticket.put(random_number, false);
        }
    }

    void displayticket() {
        Iterator<Integer> itemkey = ticket.keySet().iterator();
        int row = 0;
        while (itemkey.hasNext()) {
            if (row % 5 == 0) {
                System.out.println();
            }
            int key = itemkey.next();
            System.out.print(key + ":" + ticket.get(key) + "    ");
            row++;
        }
        System.out.println("\n");
    }

    public void run() {
        ticketgenerator();
        displayticket();
    }

}