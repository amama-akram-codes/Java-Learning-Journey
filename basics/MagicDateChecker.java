package com.learnjava.datetime;

import java.util.Scanner;

public class MagicDateChecker {

    static void magicDate(int m, int d, int y) {
        int product = m * d;

        if (product == y) {
            System.out.println("Magic date!");
        } else {
            System.out.println("Not a magic date.");
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            System.out.print("Month: ");
            int m = input.nextInt();

            System.out.print("Day: ");
            int d = input.nextInt();

            System.out.print("Two-digit year: ");
            int y = input.nextInt();

            magicDate(m, d, y);
        }
    }
}