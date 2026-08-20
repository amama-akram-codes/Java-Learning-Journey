package com.learnjava.loops;
import java.util.Scanner;
public class SalaryCalculator {

	    public static void main(String[] args) {
	        try (Scanner input = new Scanner(System.in)) {
				final int STANDARD_HOURS = 40;
				final double OVERTIME_RATE = 1.5;
				
				for (int i = 1; i <= 3; i++) {
				    System.out.printf("Enter hours worked for employee %d: ", i);
				    double hoursWorked = input.nextDouble();
				    
				    System.out.printf("Enter hourly rate for employee %d: ", i);
				    double hourlyRate = input.nextDouble();
				    
				    double grossPay;
				    if (hoursWorked <= STANDARD_HOURS) {
				        grossPay = hoursWorked * hourlyRate;
				    } else {
				        double overtimeHours = hoursWorked - STANDARD_HOURS;
				        grossPay = (STANDARD_HOURS * hourlyRate) + 
				                  (overtimeHours * hourlyRate * OVERTIME_RATE);
				    }
				    
				    System.out.printf("Employee %d gross pay: $%.2f%n%n", i, grossPay);
				}
			}
	        
	    }
	    }

	