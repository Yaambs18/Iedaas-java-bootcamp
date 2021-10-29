package com.javabootcamp.assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

class Checker implements Runnable{
    private HashMap<Integer, Boolean> playersticket;
    private String player;

    Checker(HashMap<Integer, Boolean> playersticket, String player){
        this.playersticket=playersticket;
        this.player=player;
    }
    void checker (){
        String filepath = "/home/yaambs18/IdeaProjects/Iedaas-java-bootcamp/src/com/javabootcamp/assignment1/TambolaBoard.txt";

        HashMap<Integer, Boolean> board = new HashMap<>();
        try {
            File boardfile = new File(filepath);
            Scanner myReader = new Scanner(boardfile);
            String data = myReader.nextLine();
            String tamboladata = data.substring(1,data.length()-1);
            String[] pairs = tamboladata.split(",");
            for (String pair : pairs) {
                String[] keyValue = pair.split("=");
                board.put(Integer.parseInt(keyValue[0].trim()), Boolean.valueOf(keyValue[1]));
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        Iterator<Integer> ticketkeys = playersticket.keySet().iterator();
        try {
            int count = 0;
            while (ticketkeys.hasNext()) {
                int key = ticketkeys.next();
                if (board.get(key).equals(false)) {
                    count+=1;
                }
            }
            if(count==0){
                System.out.println("Congratulations....."+player+" Won!!!!");
                System.exit(0);
            }
            else{
                System.out.println("Invalid housie");
                System.exit(0);
            }
        }
        catch (NullPointerException e) {
            System.out.println("Wrong path provided.......");
        }
    }
    public void run(){
        checker();
    }
}

