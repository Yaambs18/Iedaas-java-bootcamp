package com.javabootcamp.assignment1;

import java.util.HashMap;

public class GameExecutor {

    public static void main(String[] args) {
        TambolaBoard boardObj = new TambolaBoard();
        HashMap<Integer,Boolean> board = boardObj.boardMaker();
        boardObj.displayBoard(board);

        Player player1 = new Player();
        Player player2 = new Player();
        Thread playerThread1 = new Thread(player1);
        Thread playerThread2 = new Thread(player2);

        playerThread1.start();
        try {
            playerThread1.join();
            playerThread2.start();
            playerThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Dealer dealer = new Dealer();
        dealer.randomnumber(board);

        Checker checker = new Checker();
        System.out.println("Wait I am checking.....");
        try {
            checker.checker(player1.gettickets(),"Player1");
            checker.checker(player2.gettickets(),"Player2");

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}


