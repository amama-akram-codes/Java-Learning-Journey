package com.learnjava.conditionals;
import java.util.Scanner;
public class CreditLimitCalculator {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		        try (Scanner input = new Scanner (System.in)) {
					System.out.print("Enter account number: ");
					int accountNumber = input.nextInt();
					
					System.out.print("Enter beginning balance: ");
					int beginningBalance = input.nextInt();
					
					System.out.print("Enter total charges: ");
					int totalCharges = input.nextInt();
					
					System.out.print("Enter total credits: ");
					int totalCredits = input.nextInt();
					
					System.out.print("Enter credit limit: ");
					int creditLimit = input.nextInt();
					
					int newBalance = beginningBalance + totalCredits - totalCharges;
					
					System.out.printf("New balance: $%d%n", newBalance);
					
					if (newBalance > creditLimit) {
					    System.out.println("Credit limit exceeded");
					}
				}
		        
		       
		    
		}
	}


