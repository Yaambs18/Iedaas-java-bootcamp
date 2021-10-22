package com.javabootcamp.testarrays;

public class ArrayClone {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        System.out.println("Original array:");
        for(int i:arr)
            System.out.println(i);

        System.out.println("Clone of the array:");
        int[] carr=arr.clone();
        for(int i:carr)
            System.out.println(i);

        System.out.println("Are both equal?");
        System.out.println(arr==carr);

    }
}
