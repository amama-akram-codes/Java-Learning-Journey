package com.learnjava.loops;
import java.util.Scanner;

public class OddSumCalculator {

		    public static void main(String[] args) {
		    	
		        int sum = 0;
		        try (Scanner input = new Scanner(System.in)) {
					System.out.print("Enter an integer: ");
					int limit = input.nextInt();

					for (int i = 1; i <= limit; i++) {
					    if (i % 2 != 0) {
					        if (i % 10 == 7) {
					            continue;
					        }
					        sum += i;
					        if (sum > 500) {
					            break;
					        }
					    }
					}
				}
		        System.out.println("The sum of odd numbers is: " + sum);
		       
		    }
		}