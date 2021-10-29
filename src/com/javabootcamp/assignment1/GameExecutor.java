package com.javabootcamp.assignment1;

public class GameExecutor {

    public static void main(String[] args) {
        TambolaBoard boardObj = new TambolaBoard();
        Thread tambolaBoard = new Thread(boardObj);
        tambolaBoard.start();

        Player player1 = new Player();
        Player player2 = new Player();
        Thread playerThread1 = new Thread(player1);
        Thread playerThread2 = new Thread(player2);

        playerThread1.start();
        playerThread2.start();

        boardObj.displayBoard();
        System.out.println("-------------------Player1 ticket -------------------");
        player1.displayticket();
        System.out.println("-------------------Player2 ticket -------------------");
        player2.displayticket();

        Dealer dealer = new Dealer();
        dealer.randomnumber(boardObj.getboard());

        Checker player1Checker = new Checker(player1.gettickets(),"Player1");
        Checker player2Checker = new Checker(player2.gettickets(),"Player2");
        Thread player1CheckerThread = new Thread(player1Checker);
        Thread player2CheckerThread = new Thread(player2Checker);
        System.out.println("Wait I am checking.....");
        player1CheckerThread.start();
        player2CheckerThread.start();
    }
}
