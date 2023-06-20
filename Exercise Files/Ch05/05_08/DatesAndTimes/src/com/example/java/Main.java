package com.example.java;

import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {

		// a date object is initialized with current date info
		Date dt  = new Date();
		System.out.println(dt);  //output: Tue Jun 20 11:08:55 CDT 2023

		// To add other dates first create a calendar object
		GregorianCalendar gc = new GregorianCalendar(2009, 1, 28);
		gc.add(GregorianCalendar.DATE, 1);   // add 1 day to the current date

		Date tm = gc.getTime();
		System.out.println(tm);
	}

}
