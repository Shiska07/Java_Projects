package com.example.java;

public class Main {

    public static void main(String[] args) {

        String s1 = "Welcome to California!";
        System.out.println(("Length: " + s1.length() ));

        int pos = s1.indexOf("California");
        System.out.println("California is in index: " + pos);

        String sub = s1.substring(11);
        System.out.println(sub);

    }

}
