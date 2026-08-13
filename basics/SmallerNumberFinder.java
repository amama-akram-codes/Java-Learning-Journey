package com.learnjava.basics;
import java.util.Scanner;
public class SmallerNumberFinder {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			System.out.println("Enter number 1:");
			int a = input.nextInt();
			
			System.out.println("Enter number 2:");
			int b = input.nextInt();
			if (a<b)
				 System.out.println(" a is smaller.");
			 else
				 System.out.println(" b is smaller.");
		}
	}
	
 public static void display(int a, int b) {
	 
	 
	 if (a<b)
		 System.out.println(" a is smaller."+a);
	 else
		 System.out.println(" b is smaller."+b);
	 
}
public static void display(int a, int b, int c) {
	int smallest=a;
	if (b<a)
		smallest=b;
	else if(c<b)
		smallest =c;
	System.out.println(" smallest number is "+smallest);
	
}
}