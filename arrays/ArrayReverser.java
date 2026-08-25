package com.learnjava.arrays;
import java.util.Arrays;
public class ArrayReverser {
    public static String[] reverseArray(String[] arr) {
        String[] reversed = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public static void main(String[] args) {
       
        String[] arr1 = {"India", "is", "looser"};
        String[] arr2 = reverseArray(arr1);
        System.out.println("Original array: " + Arrays.toString(arr1));
        System.out.println("Reversed array: " + Arrays.toString(arr2));
    }
}