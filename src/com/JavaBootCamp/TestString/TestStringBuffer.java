package com.JavaBootCamp.TestString;

public class TestStringBuffer {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Yansh");
        s.append("Bhardwaj");
        System.out.println(s);
        System.out.println(s.capacity());

        s.insert(0,"-");
        System.out.println(s);

        //System.out.println(s.reverse());

        s.replace(0,5,"YANSH");
        System.out.println(s);

        s.delete(7,10);
        System.out.println(s);

    }
}
