package com.learnjava.exceptions;
import java.util.Scanner;
public class QuotientCalculator {
public static int quotient(int number1, int number2) {
	return number1/number2;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    System.out.print("Enter two integers:");
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    try {
    	int result = quotient(number1,number2);
    	System.out.println(number1 +"/"+ number2+"is"+ result);
    }
    catch(ArithmeticException ex) {
    	System.out.println("Exception: an integer cannot be divided by zero");
    	
    }
	}

}
