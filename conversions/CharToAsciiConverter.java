package com.learnjava.conversions;
import java.util.Scanner;
public class CharToAsciiConverter {

	public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter any character: ");
			char c = input.next().charAt(0);

			System.out.println("ASCII/Unicode: " + (int)c);
		}
    }
}