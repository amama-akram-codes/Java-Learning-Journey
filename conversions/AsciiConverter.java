package com.learnjava.conversions;
import java.util.Scanner;
public class AsciiConverter {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("ASCII (0-127): ");
			int value = input.nextInt();

			char symbol = (char) value;
			System.out.println("Character: " + symbol);
		}
    }
}


