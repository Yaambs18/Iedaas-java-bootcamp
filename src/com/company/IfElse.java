package com.company;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Temp: ");
        int temp = scanner.nextInt();
        if (temp>30){
            System.out.println("It's a hot dat \n Drink Water");
        }
        else if (temp>20 && temp < 30){
            System.out.println("Beautiful Day");
        }
        else{
            System.out.println("Cold day");
        }
    }
}
