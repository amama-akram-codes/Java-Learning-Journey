package com.learnjava.conditionals;

public class DanglingElseProblem {

	    public static void main(String[] args) {
	        int x = 5;
	        int y = 8;
	        
	        System.out.println("Part a) Output:");
	        if (x == 5) {
	            if (y == 8)
	                System.out.println("@ @ @ @ @");
	        } else {
	            System.out.println("####");
	        }
	        System.out.println("$$$$$");
	        System.out.println("&&&&&");
	        
	        
	        System.out.println("\nPart b) Output:");
	        if (x == 5) {
	            if (y == 8)
	                System.out.println("@ @ @ @ @");
	        } else {
	            System.out.println("####");
	            System.out.println("$$$$$");
	            System.out.println("&&&&&");
	        }
	        
	        
	        System.out.println("\nPart c) Output:");
	        if (x == 5) {
	            if (y == 8)
	                System.out.println("@ @ @ @ @");
	            else {
	                System.out.println("####");
	                System.out.println("$$$$$");
	                System.out.println("&&&&&");
	            }
	        }
	        
	        
	        x = 5;
	        y = 7;
	        System.out.println("\nPart d) Output:");
	        if (x == 5) {
	            if (y == 8)
	                System.out.println("@ @ @ @ @");
	            else {
	                System.out.println("####");
	                System.out.println("$$$$$");
	                System.out.println("&&&&&");
	            }
	        }
	    }
	}