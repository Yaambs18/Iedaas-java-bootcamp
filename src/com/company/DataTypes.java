package com.company;

public class DataTypes {
    public static void main(String[] args) {
        byte age = 21;
        int subscribeCount = 123456789;
        long viewCount = 9876543210L;
        float percentage = 82.4f;
        char firstLetter = 'A';
        boolean isAdult = true;
        System.out.println("Hello World!" + " " +age + " " +subscribeCount + " " +viewCount + " " +percentage + " " +firstLetter + " " +isAdult);

        String message = "     Hi! This is Yansh here";
        System.out.println(message.indexOf("Yansh"));
        System.out.println(message.indexOf('i', 2));
        System.out.println(message.replace("Yansh", "Priyanshu"));
        System.out.println(message.trim());
    }
}
