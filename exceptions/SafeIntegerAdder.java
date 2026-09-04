package com.learnjava.exceptions;
import java.util.Scanner;
import java.util.InputMismatchException;

public class SafeIntegerAdder {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Enter first integer: ");
                num1 = sc.nextInt();

                System.out.print("Enter second integer: ");
                num2 = sc.nextInt();

                valid = true; 

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter integers only.");
                sc.nextLine(); 
            }
        }

        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }
}