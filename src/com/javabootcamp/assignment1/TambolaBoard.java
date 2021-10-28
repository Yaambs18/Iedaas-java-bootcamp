package com.javabootcamp.assignment1;

import java.util.HashMap;
import java.util.Iterator;

public class TambolaBoard {
    public HashMap<Integer, Boolean> boardMaker() {
        HashMap<Integer, Boolean> board = new HashMap<>();
        int number;
        for(number=1;number<91;number++) {
            board.put(number, false);
        }
        return board;
    }
    protected void displayBoard(HashMap<Integer, Boolean> board){
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

}
