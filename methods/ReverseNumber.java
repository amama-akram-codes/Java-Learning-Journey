package com.learnjava.methods;
import java.util.Scanner;
public class ReverseNumber {
    public static void reverseDisplay(int value) {
        if (value == 0) return;

        System.out.print(value % 10);
        reverseDisplay(value / 10);
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			int num = input.nextInt();

			reverseDisplay(num);
		}
    }
}