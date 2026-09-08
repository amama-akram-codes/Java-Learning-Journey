package com.learnjava.games;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			boolean playAgain = true;

			while (playAgain) {
			    Random random = new Random();
			    int targetNumber = random.nextInt(100) + 1; 
			    int attempts = 0;
			    boolean guessedCorrectly = false;

			    System.out.println("Guess a number between 1 and 100");

			    while (attempts < 5 && !guessedCorrectly) {
			        System.out.print("Enter your guess: ");
			        
			    
			    int userGuess = 0;
			        boolean validInput = false;
			        
			    while (!validInput) {
			            if (input.hasNextInt()) {
			                userGuess = input.nextInt();
			                
			            if (userGuess >= 1 && userGuess <= 100) {
			                    validInput = true;
			            } else {
			                    System.out.println("Please enter a number between 1 and 100.");
			                    System.out.print("Enter your guess: ");
			                }
			            } else {
			                System.out.println("Invalid input. Please enter a number.");
			                input.next();
			                System.out.print("Enter your guess: ");
			            }
			        }

			        if (userGuess == targetNumber) {
			            System.out.println("Congratulations! You guessed the number.");
			            guessedCorrectly = true;
			        } else if (userGuess > targetNumber) {
			            System.out.println("Too high!");
			        } else {
			            System.out.println("Too low!");
			        }
			        attempts++;
			    }

			    if (!guessedCorrectly) {
			        System.out.println("Out of attempts! The number was " + targetNumber);
			    }

			    System.out.print("Do you want to play again? (true/false): ");
			    playAgain = input.nextBoolean();
			}
		}
     
    }
}



