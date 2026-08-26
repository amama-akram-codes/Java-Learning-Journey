package com.learnjava.arrays;
import java.util.Scanner;
public class MatrixMaxSumFinder {
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
        int maxRowSum = Integer.MIN_VALUE;
        int maxRowIndex = -1;
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += arr[i][j]; }
            if (rowSum > maxRowSum) {
                maxRowSum = rowSum;
                maxRowIndex = i; }}
        int maxColSum =0;
        for(int i=0; i<rows;i++) {
        	 maxColSum += arr[i][0];
        }
        int  maxColIndex = 0;
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += arr[i][j]; }
            if (colSum > maxColSum) {
                maxColSum = colSum;
                maxColIndex = j;    } }
        System.out.println("\nRow with maximum sum: Row " + maxRowIndex + " (Sum = " + maxRowSum + ")");
        System.out.println("Column with maximum sum: Column " + maxColIndex + " (Sum = " + maxColSum + ")");
        sc.close();
    }
}