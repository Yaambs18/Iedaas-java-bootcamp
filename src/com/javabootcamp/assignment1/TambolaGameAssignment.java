package com.javabootcamp.assignment1;

import java.util.HashMap;
import java.util.Iterator;

public class TambolaGameAssignment extends Thread{

    public HashMap<Integer, Boolean> ticketgenerator() {
        HashMap<Integer, Boolean> ticket = new HashMap<>();
        int random_number;
        int min = 1, max = 90;
        while (ticket.size() != 15) {
            random_number = (int) (Math.random() * (max - min + 1) + min);
            ticket.put(random_number, false);
        }
        return ticket;
    }

    public void displayticket(HashMap<Integer, Boolean> ticket){
        Iterator<Integer> itemkey = ticket.keySet().iterator();
        int row = 0;
        while(itemkey.hasNext())
        {
            if(row%5==0){
                System.out.println();
            }
            int key= itemkey.next();
            System.out.print(key+":"+ticket.get(key)+"    ");
            row++;
        }
        System.out.println();
    }

    public void displayboard(HashMap<Integer, Boolean> board){
        Iterator<Integer> itemskey = board.keySet().iterator();
        int row = 0;
        while(itemskey.hasNext())
        {
            if(row%9==0){
                System.out.println();
            }
            int key=itemskey.next();
            System.out.print(key+":"+board.get(key)+"    ");
            row++;
        }
        System.out.println();
    }

    public HashMap<Integer, Boolean> boardmaker() {
        HashMap<Integer, Boolean> board = new HashMap<>();
        int number;
        for(number=1;number<91;number++) {
            board.put(number, false);
        }
        return board;
    }

    public void randomnumber(HashMap<Integer,Boolean> playerticket, HashMap<Integer,Boolean> tambola_board){
        System.out.println("Let's begin the game..................");
        while(playerticket.containsValue(false)){
            int random_number;
            int min=1,max=90;
            random_number = (int)(Math.random()*(max - min+1)+min);
            if(!tambola_board.get(random_number)){
                tambola_board.replace(random_number, true);
                System.out.println(random_number);
                if(playerticket.containsKey(random_number)){
                    playerticket.replace(random_number, true);
                    displayticket(playerticket);
                }
            }
            try {
                TambolaGameAssignment.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }

            }
        System.out.println("Hey! It's Housie, please verify....");
        checker(playerticket, tambola_board);
        }
    void checker(HashMap<Integer,Boolean> playerticket, HashMap<Integer,Boolean> tambola_board){
        System.out.println("Wait I am checking.....");
        Iterator<Integer> ticketkeys = playerticket.keySet().iterator();
        while(ticketkeys.hasNext()){
            int key=ticketkeys.next();
            if(!tambola_board.get(key)){
                System.out.println("Sorry you did some incorrect removal.");
            }
        }
        System.out.println("Congratulations..... You Won!!!!");

    }
    public static void main(String[] args) {
        TambolaGameAssignment obj = new TambolaGameAssignment();
        HashMap<Integer, Boolean> player1 = obj.ticketgenerator();
        obj.displayticket(player1);
        HashMap<Integer,Boolean> tambolaboard = obj.boardmaker();
        obj.displayboard(tambolaboard);
        obj.randomnumber(player1, tambolaboard);
    }
}


