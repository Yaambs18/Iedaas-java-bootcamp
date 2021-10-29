package com.javabootcamp.assignment1;

import java.util.HashMap;
import java.util.Iterator;

public class TambolaBoard implements Runnable{

    private HashMap<Integer, Boolean> board;

    TambolaBoard(){
        this.board = new HashMap<>();
    }

    HashMap<Integer, Boolean> getboard() {
        return board;
    }
    void boardMaker() {
        int number;
        for(number=1;number<91;number++) {
            board.put(number, false);
        }
    }
    protected void displayBoard(){
        System.out.println("Tambola board................");
        Iterator<Integer> itemsKey = board.keySet().iterator();
        int row = 0;
        while(itemsKey.hasNext())
        {
            if(row%9==0){
                System.out.println();
            }
            int key=itemsKey.next();
            System.out.print(key+":"+board.get(key)+"    ");
            row++;
        }
        System.out.println("\n");
    }
    public void run(){
        boardMaker();
    }
}
