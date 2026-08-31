package com.learnjava.recursion;

public class RecursivePowerCalculator {
    public static double power(double a, int n) {
        return calc(a, n);
    }

    private static double calc(double a, int n) {
        if (n == 0) return 1;
        return a * calc(a, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(3, 4));
    }
}