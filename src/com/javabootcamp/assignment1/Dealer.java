package com.javabootcamp.assignment1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

class Dealer{

    String filepath = "/home/yaambs18/IdeaProjects/Iedaas-java-bootcamp/src/com/javabootcamp/assignment1/TambolaBoard.txt";

    void randomnumber(HashMap<Integer,Boolean> tambolaBoard){
        System.out.println("Let's begin the game..................");
        Scanner sc = new Scanner(System.in);
        String pressedkey;
        while(tambolaBoard.containsValue(false)){
            int random_number;
            int min=1,max=90;
            random_number = (int)(Math.random()*(max - min+1)+min);
            if(!tambolaBoard.get(random_number)) {
                pressedkey = sc.nextLine();
                System.out.println("Press enter to continue else press any key if it's \"Housie\"");
                tambolaBoard.replace(random_number, true);
                System.out.println(random_number);

                if(!pressedkey.equals("")){
                    System.out.println("Hey! It's Housie, please verify....");
                    break;
                }
            }
        }
        FileWriter file;
        try {
            file = new FileWriter(filepath);
            String boarddata = tambolaBoard.toString();
            file.write(boarddata);
            file.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
