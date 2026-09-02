package com.learnjava.exceptions;
import java.util.*;

public class ExceptionHandlingExample {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); 
        
        while(true) {
            try {
                System.out.print("Enter an integer value: ");
                int n = input.nextInt();
                System.out.println("Factorial = " + factorial(n));
                break;  
            }
            catch(InputMismatchException ex) {
                System.out.println("You have entered an invalid input");
                System.out.println("Try Again");
                input.nextLine(); 
            }
        }
        
        input.close(); 
    }
    
    static int factorial(int n) {
        int f = 1;
        for(int i = 1; i <= n; i++)
            f *= i;
        return f;
    }
}