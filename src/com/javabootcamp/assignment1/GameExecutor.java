package com.javabootcamp.assignment1;

import java.util.HashMap;
import java.io.*;

public class GameExecutor extends Thread{
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
                }
                TambolaGameAssignment.displayticket(playerticket);
            }
            try {
                GameExecutor.sleep(1);
            }
            catch (Exception e){
                System.out.println(e);
            }

        }
        FileWriter file;
        String filepath = "/home/yaambs18/IdeaProjects/Iedaas-java-bootcamp/src/com/javabootcamp/assignment1/TambolaBoard.txt";
        try {
            file = new FileWriter(filepath);
            String boarddata = tambola_board.toString();
            file.write(boarddata);
            file.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
        System.out.println("Hey! It's Housie, please verify....");
        TambolaGameAssignment.checker(playerticket, filepath);
    }

    public static void main(String[] args) {
        TambolaGameAssignment obj = new TambolaGameAssignment();
        GameExecutor obj1 = new GameExecutor();
        HashMap<Integer, Boolean> player1 = obj.ticketgenerator();
        TambolaGameAssignment.displayticket(player1);
        try {
            GameExecutor.sleep(3000);
        }catch (InterruptedException exp){
            System.out.println(exp);
        }
        HashMap<Integer,Boolean> tambolaboard = obj.boardmaker();
        obj.displayboard(tambolaboard);
        obj1.randomnumber(player1, tambolaboard);
    }
}
