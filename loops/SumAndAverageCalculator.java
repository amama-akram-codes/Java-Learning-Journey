package com.learnjava.loops;

import java.util.Scanner;

public class SumAndAverageCalculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			int limit;    
			int number;    
			int sum;      
			int counter;   

			System.out.print("Enter the number of integers in the list: ");
			limit = input.nextInt();

			sum = 0;
			counter = 0;

			System.out.println("Enter " + limit + " integers:");

			while (counter < limit) {
			    number = input.nextInt();
			    sum = sum + number;
			    counter++;
			}

			System.out.printf("The sum of the %d numbers = %d%n", limit, sum);

			if (counter != 0)
			    System.out.printf("The average = %d%n", (sum / counter));
			else
			    System.out.println("No input.");
		}
    }
}