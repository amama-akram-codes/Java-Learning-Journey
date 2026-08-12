package com.learnjava.basics;
import java.util.Scanner;
public class NumberReverser {
    public static void reverse(int number) {
        int rev = 0;
        int temp = number;

        while (temp != 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }

        System.out.println("Reversed: " + rev);

        if (rev == number)
            System.out.println("Number is palindrome");
        else
            System.out.println("Number is not palindrome");
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter number: ");
			int n = input.nextInt();

			reverse(n);
		}
    }
}