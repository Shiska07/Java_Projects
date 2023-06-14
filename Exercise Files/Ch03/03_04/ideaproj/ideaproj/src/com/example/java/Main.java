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
    }
}