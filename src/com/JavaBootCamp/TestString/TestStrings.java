package com.JavaBootCamp.TestString;

public class TestStrings {
    public static void main(String[] args) {
        String name = "Yansh";
        System.out.println("Hi "+ name);
        System.out.println("Hi " + name.concat("Bhardwaj"));

        int a = 50;
        String str = String.valueOf(a);
        System.out.println(str);

        name = name.concat("Bhardwaj");
        System.out.println(name);

        name  = name.replace("Bhardwaj", "Sharma");
        System.out.println("the new value  : "+name);

        System.out.println("The str2 contains :"+name.contains("a"));

        String str1 = "Hello";
        String str2 = "hello";
        System.out.println("str1 is compared to str2 using equal method :"+str1.equals(str2));
        System.out.println("str1 is compared to str2 using equalIgnoreCase method :"+str1.equalsIgnoreCase(str2));

        System.out.println("str1 is compared to str2 using compareTo method :"+ str2.compareTo(str1));

        System.out.println("the length using length method :"+ str1.length());
        System.out.println("The substring using substring method :"+ name.substring(2));
        System.out.println("The Character using charAt method :"+ name.charAt(3));
        System.out.println("endWith method :"+ name.endsWith("h"));

    }
}
