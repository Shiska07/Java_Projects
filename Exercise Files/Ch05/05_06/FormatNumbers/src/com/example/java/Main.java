package com.example.java;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        double doubleValue = 1_234_567.89;  // the underscore is just for readability
        System.out.println(doubleValue);   // output:1234567.89

        NumberFormat numF = NumberFormat.getNumberInstance();
        System.out.println(numF.format(doubleValue)); //output: 1,234,567.89

        // setting up locale for a specific format
        Locale loc = new Locale("da", "DK");

        NumberFormat numF2= NumberFormat.getNumberInstance(loc);
        System.out.println(numF2.format(doubleValue)); //output: 1.234.567,89

        // currency
        NumberFormat curF = NumberFormat.getCurrencyInstance();
        System.out.println(curF.format(doubleValue)); //output: $1,234,567.89

        NumberFormat curF2 = NumberFormat.getCurrencyInstance(loc);
        System.out.println(curF2.format(doubleValue)); //output: 1.234.567,89 kr.
    }

}
