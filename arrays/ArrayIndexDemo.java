package com.learnjava.arrays;

import java.util.Scanner;

public class ArrayIndexDemo {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 1000); 
        }

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an array index (0 to 99): ");

        try {
            int index = input.nextInt();   
            System.out.println("Value at index " + index + " = " + arr[index]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }
        catch (Exception e) {
            System.out.println("Invalid Input! Please enter only integers.");
        }
        
        input.close();
    }
}