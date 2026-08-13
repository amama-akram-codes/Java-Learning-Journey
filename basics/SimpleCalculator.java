package com.learnjava.basics;
import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 
		        try (Scanner input = new Scanner(System.in)) {
					System.out.print("Enter  number 1: ");
					double num1 = input.nextDouble();

					System.out.print("Enter an operator (+, -, *, /): ");
					char operator = input.next().charAt(0);
					
					System.out.print("Enter number 2: ");
					double num2 = input.nextDouble();

      

					double result;

					
					switch (operator) {
					    case '+':
					        result = num1 + num2;
					        System.out.println("Result = " + result);
					        break;
					    case '-':
					        result = num1 - num2;
					        System.out.println("Result = " + result);
					        break;
					    case '*':
					        result = num1 * num2;
					        System.out.println("Result = " + result);
					        break;
					    case '/':
					        if (num2 != 0)
					            result = num1 / num2;
					        else {
					            System.out.println("Error! Division by zero.");
					            return;
					        }
					        System.out.println("Result = " + result);
					        break;
					    default:
					        System.out.println("Invalid operator!");
					}
				}

		       
		    }
		

		 
	}
	


