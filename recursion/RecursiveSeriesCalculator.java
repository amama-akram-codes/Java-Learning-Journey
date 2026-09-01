package com.learnjava.recursion;

public class RecursiveSeriesCalculator {
    public static double m(int i) {
        if (i == 1)
            return 1.0 / 3;
         return term(i) + m(i - 1);
    }
    private static double term(int i) {
        return (double) i / (2 * i + 1);
    }
    public static void main(String[] args) {
        for (int k = 1; k <= 10; k++) {
            System.out.println("m(" + k + ") = " + m(k));
        }
    }
}
