package com.javabootcamp.assignment1;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

class TambolaGameAssignment {

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

    public static void displayticket(HashMap<Integer, Boolean> ticket){
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
        System.out.println("\n");
    }

    public void displayboard(HashMap<Integer, Boolean> board){
        System.out.println("Tambola board................");
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
        System.out.println("\n");
    }

    public HashMap<Integer, Boolean> boardmaker() {
        HashMap<Integer, Boolean> board = new HashMap<>();
        int number;
        for(number=1;number<91;number++) {
            board.put(number, false);
        }
        return board;
    }

    public static void checker(HashMap<Integer,Boolean> playerticket, String path){
        System.out.println("Wait I am checking.....");
        HashMap<Integer, Boolean> board = new HashMap<Integer, Boolean>();
        try {
            File boardfile = new File(path);
            Scanner myReader = new Scanner(boardfile);
            String data = myReader.nextLine();
            String tamboladata = data.substring(1,data.length()-1);
            String[] pairs = tamboladata.split(",");
            for (int i=0;i<pairs.length;i++) {
                String pair = pairs[i];
                String[] keyValue = pair.split("=");
                board.put(Integer.parseInt(keyValue[0].trim()), Boolean.valueOf(keyValue[1]));
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }

        Iterator<Integer> ticketkeys = playerticket.keySet().iterator();
        try {
            while (ticketkeys.hasNext()) {
                int key = ticketkeys.next();
                if (!board.get(key)) {
                    System.out.println("Sorry you did some incorrect removal.");
                }
            }
            System.out.println("Congratulations..... You Won!!!!");
        }
        catch(NullPointerException e){
            System.out.println("Wrong path provided.......");
        }

    }
    public static void main(String[] args) {

    }
}