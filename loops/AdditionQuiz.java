package com.learnjava.loops;
import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int answer = number1 + number2;

        try (Scanner input = new Scanner(System.in)) {
			System.out.print("What is " + number1 + " + " + number2 + "? ");

			int userAnswer = input.nextInt();

			while (userAnswer != answer) {
			    System.out.println("Wrong answer. Try again.");
			    System.out.print("What is " + number1 + " + " + number2 + "? ");
			    userAnswer = input.nextInt();
			}
		}
        System.out.println("You guessed the right answer!");
    }
}