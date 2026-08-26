package com.learnjava.arrays;
import java.util.Scanner;
public class MatrixPrimeAnalyzer {   
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 3;
        int cols = 4;
        int[][] arr = new int[rows][cols];
        System.out.println("Enter elements for a 3x4 array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                arr[i][j] = sc.nextInt();}}
        int maxPrimeRowCount = -1;
        int maxPrimeRowIndex = -1;
        for (int i = 0; i < rows; i++) {
            int primeCount = 0;
            for (int j = 0; j < cols; j++) {
                if (isPrime(arr[i][j])) primeCount++;
            }
            if (primeCount > maxPrimeRowCount) {
                maxPrimeRowCount = primeCount;
                maxPrimeRowIndex = i;
            }
        }

        
        int maxPrimeColCount = -1;
        int maxPrimeColIndex = -1;
        for (int j = 0; j < cols; j++) {
            int primeCount = 0;
            for (int i = 0; i < rows; i++) {
                if (isPrime(arr[i][j])) primeCount++;
            }
            if (primeCount > maxPrimeColCount) {
                maxPrimeColCount = primeCount;
                maxPrimeColIndex = j;
            }
        }

       
        System.out.println();
        if (maxPrimeRowCount >= maxPrimeColCount) {
            System.out.println("Row " + maxPrimeRowIndex + " has the maximum number of prime numbers (" + maxPrimeRowCount + ")");
        } 
        if (maxPrimeColCount >= maxPrimeRowCount) {
            System.out.println("Column " + maxPrimeColIndex + " has the maximum number of prime numbers (" + maxPrimeColCount + ")");
        }

        sc.close();
    }
}
