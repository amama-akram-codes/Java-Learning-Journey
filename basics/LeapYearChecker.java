package com.learnjava.basics;
import java.util.Scanner;
public class LeapYearChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		year=0;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the year:");
			year = input.nextInt();
		}
		if ((year%4==0 && year%100!=0) || year%400==0)
		{

			System.out.println("Year is leap year.");
		}

		else {
			System.out.println("Year is not a leap year.");
		}
			
	
	}
}
