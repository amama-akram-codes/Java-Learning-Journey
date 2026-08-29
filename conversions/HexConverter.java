package com.learnjava.conversions;
import java.util.Scanner;
public class HexConverter {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter number (0–15): ");
			int n = input.nextInt();

			String hex = Integer.toHexString(n);
			System.out.println("Hex = " + hex.toUpperCase());
		}
    }
}