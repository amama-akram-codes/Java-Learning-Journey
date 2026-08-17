package com.learnjava.loops;

public class CompoundInterestCalculator {

	    public static void main(String[] args) {
	        double principal = 1000.0; 
	        
	        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
	        
	        
	        for (int rate = 5; rate <= 10; rate++) {
	            System.out.printf("Interest Rate: %d%%%n", rate);
	            double currentRate = rate / 100.0;
	       
	            for (int year = 1; year <= 10; ++year) {
	                double amount = principal * Math.pow(1.0 + currentRate, year);
	                
	                System.out.printf("%4d%,20.2f%n", year, amount);
	            }
	            System.out.println(); 
	        }
	    }
	}