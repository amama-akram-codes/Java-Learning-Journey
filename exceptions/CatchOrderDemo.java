package com.learnjava.exceptions;

public class CatchOrderDemo {
    public static void main(String[] args) {
    	        try {
    	            int result = 10 / 0; 
    	        } 
    	        catch (ArithmeticException e) {
    	            System.out.println("Caught arithmetic exception: " + e);
    	        }
    	        catch (Exception e) {
    	            System.out.println("Caught general exception: " + e);
    	        }
    	    }
    	}