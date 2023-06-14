package com.example.java;

import java.math.BigDecimal;

// using bigdecimal object for floating point precision
public class Main{
    public static void main(String[] args){
        double value = 0.012;
        double valueSum3 = value + value + value;
        System.out.println("The double sum is: " + valueSum3);

        // first convert your double to string
        String sValue = Double.toString(value);

        // then create a big decimal object from the string
        BigDecimal bdValue = new BigDecimal(sValue);
        BigDecimal bSum3 = bdValue.add(bdValue).add(bdValue);

        System.out.println("The bigdecimal sum is: " + bSum3.toString());

        /*
        Converting Datatypes:

        1. Converting a smaller datatype to a bigger type is easy and only requires assignment: For example
            converting an int to a long type.
        2. However, converting a larger datatype to a smaller datatype requires casting during assignment. For example
            converting an int to a byte
         */

        int iVal = 43;
        int iVal2 = iVal;  // a copy is made and stored as opposed to the variables having the same address

        // convert to long
        long lVal = iVal2;

        byte bVal = (byte) iVal2; // requires casting

    }
}