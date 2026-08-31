package com.learnjava.recursion;

import java.util.Scanner;

public class RecursiveMaxFinder {
    public static int findMax(int[] arr, int last) {
        if (last == 0)
            return arr[0];

        int max = findMax(arr, last - 1);
        return (arr[last] > max) ? arr[last] : max;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[8];

        System.out.println("Enter 8 integers:");
        for (int i = 0; i < 8; i++)
        	nums[i] = sc.nextInt();

        System.out.println("Largest = " + findMax(nums, nums.length - 1));
    }
}