package com.learnjava.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeFactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueUntillCorrectValue = true;
        
        while (continueUntillCorrectValue) {
            try {
                System.out.println("Enter a number to find factorial:");
                int n = input.nextInt();
                int fact = 1;
                int i = 1;
                
                while (i <= n) {
                    fact = fact * i;
                    i++;
                }
                
                System.out.println("Factorial of " + n + " is: " + fact);
                continueUntillCorrectValue = false;
                
            } catch (InputMismatchException e) {
                System.out.println("Enter an integer only!");
                input.nextLine(); 
            }
        }
        
        input.close(); 
    }
}