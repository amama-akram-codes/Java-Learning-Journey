package com.learnjava.loops;

public class TrianglePatternPrinter {

	    public static void main(String[] args) {
	  
	        System.out.println("Pattern (a):");
	        for (int i = 1; i <= 10; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print('*');
	            }
	            System.out.println();
	        }
	        
	        System.out.println(); 
	        
	        System.out.println("Pattern (b):");
	        for (int i = 10; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print('*');
	            }
	            System.out.println();
	        }
	        
	        System.out.println(); 
	        
	        
	        System.out.println("Pattern (c):");
	        for (int i = 10; i >= 1; i--) {
	            
	            for (int space = 1; space <= 10 - i; space++) {
	                System.out.print(' ');
	            }
	            
	            for (int j = 1; j <= i; j++) {
	                System.out.print('*');
	            }
	            System.out.println();
	        }
	        
	        System.out.println(); 
	        
	        System.out.println("Pattern (d):");
	        for (int i = 1; i <= 10; i++) {
	            
	            for (int space = 1; space <= 10 - i; space++) {
	                System.out.print(' ');
	            }
	            
	            for (int j = 1; j <= i; j++) {
	                System.out.print('*');
	            }
	            System.out.println();
	        }
	        System.out.println("Pattern (e):");
	        for (int i = 10; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(' ');
	            }
	            System.out.println("*");
	        }
	        
	        System.out.println(); 
	        
	        System.out.println("Pattern (f):");
	        for (int i = 1; i <= 10; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(' ');
	            }
	            System.out.println("*");
	        }
	        
	        System.out.println(); 
	        
 }
	    
	}