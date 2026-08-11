package com.learnjava.basics;
import java.util.Scanner;

public class MultiplicationTableDoWhile{

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
	   Scanner input = new Scanner(System.in)) {
		System.out.println("Enter any number from 1 to 20:");
		int number= input.nextInt();
		
		 System.out.println("in multiplication table for" + number +":" );
		 
		 int i=1;
		 do {
		     System.out.println(number + "x" + i + "=" +(number*i));
		     i++;
		 }
		     while(i<=10);
	   }

	}
     }
       