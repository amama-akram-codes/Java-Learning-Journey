package com.learnjava.exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
public class SafeAgeInputHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=0;
        Scanner input = new Scanner(System.in);
        boolean continueUntillCorrectValue=true;
        do {
        	try {
        		System.out.println("Enter your age:");
        		a = input.nextInt();
        		System.out.println("Your age is ="+a);
        		 continueUntillCorrectValue=false; 
        	}
        	
        	catch(InputMismatchException e)
        
        	{
        	System.out.println("Enter your age as integer:");
        	input.nextLine();
        }
        }while(continueUntillCorrectValue);
        
        }}