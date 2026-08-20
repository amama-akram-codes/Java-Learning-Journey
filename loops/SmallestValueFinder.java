package com.learnjava.loops;
import java.util.Scanner;
public class SmallestValueFinder {

	
	
	    public static void main(String[] args) {
	        try (Scanner input = new Scanner(System.in)) {
				System.out.print("Enter the number of integers: ");
				int count = input.nextInt();
				
				if (count <= 0) {
				    System.out.println("Invalid number of integers.");
				    return;
				}
				
				System.out.print("Enter integer 1: ");
				int smallest = input.nextInt();
				
				for (int i = 2; i <= count; i++) {
				    System.out.printf("Enter integer %d: ", i);
				    int number = input.nextInt();
				    
				    if (number < smallest) {
				        smallest = number;
				    }
				}
				
				System.out.printf("The smallest integer is: %d%n", smallest);
			}
	        
	       
	    }
}