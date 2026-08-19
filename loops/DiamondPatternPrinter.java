package com.learnjava.loops;

public class DiamondPatternPrinter {
	
	    public static void main(String[] args) {
	        int size = 5; 
	        
	        
	        for (int i = 1; i <= size; i++) {
	           
	            for (int space = 1; space <= size - i; space++) {
	                System.out.print(' ');
	            }
	            
	            for (int star = 1; star <= 2 * i - 1; star++) {
	                System.out.print('*');
	            }
	            System.out.println();
	        }
	        
	        
	        for (int i = size - 1; i >= 1; i--) {
	            
	            for (int space = 1; space <= size - i; space++) {
	                System.out.print(' ');
	            }
	            
	            for (int star = 1; star <= 2 * i - 1; star++) {
	                System.out.print('*');
	            }
	            System.out.println();
	        }
	    }
	}