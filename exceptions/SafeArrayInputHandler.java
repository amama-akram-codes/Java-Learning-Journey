package com.learnjava.exceptions;
import java.util.*;

public class SafeArrayInputHandler {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        
        for (int i = 0; i < 10; i++) {
            boolean valid = false;
            while (!valid) {
                try {
                    System.out.print("Enter integer value " + (i + 1) + ": ");
                    arr[i] = sc.nextInt();
                    valid = true;
                } catch (InputMismatchException e) {
                    System.out.println("You have entered an invalid input type integer values");
                    sc.next();  
                }
            }
        }
        
        System.out.println("Array successfully filled: " + Arrays.toString(arr));
        
        sc.close(); 
    }
}