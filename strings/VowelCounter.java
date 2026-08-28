package com.learnjava.strings;

import java.util.Scanner;

public class VowelCounter {
	    @SuppressWarnings("resource")
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter text: ");
	        String str = input.nextLine().toLowerCase();

	        int count = 0;
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
	                count++;
	            }
	        }

	        System.out.println("Vowel Count: " + count);
	    }
	}