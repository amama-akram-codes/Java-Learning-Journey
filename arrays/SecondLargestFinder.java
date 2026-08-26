package com.learnjava.arrays;

import java.util.Scanner;

public class SecondLargestFinder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            num[i] = input.nextInt();
        }

        int largest = num[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < num.length; i++) {
            if (num[i] > largest) {
                secondLargest = largest;
                largest = num[i];
            } else if (num[i] > secondLargest && num[i] != largest) {
                secondLargest = num[i];
            }
        }

        System.out.println("Largest value is " + largest);
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest value found (all numbers might be the same).");
        } else {
            System.out.println("Second largest value is " + secondLargest);
        }

        input.close();
    }
}