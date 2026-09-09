package com.learnjava.games;
import java.util.Scanner;
public class RandomNumberGuesser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userNumber=0;
		try (Scanner input = new Scanner (System.in)) {
			System.out.println("Enter your guess number between 1 and 10");
			userNumber =input.nextInt();
		}
		int number=1+(int)(10*(Math.random()));
		
		if(number==userNumber)
			
		{
			System.out.println("You won!");}
			
			else if (userNumber < number ) 
			{
				System.out.println("Your guessed number is smaller.");
			}
			else if (userNumber > number)
			{
				System.out.println("Your guessed number is greater.");
			}
		
		else 
		{	System.out.println("You lost!");
		}
		System.out.printf("Computer entered number is %d",+number);	
	}

	}















