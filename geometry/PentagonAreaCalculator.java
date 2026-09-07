package com.learnjava.geometry;

import java.util.Scanner;

public class PentagonAreaCalculator {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the radius of pentagon:");
            double radius = input.nextDouble();
            
            double side = 2 * radius * Math.sin(Math.PI / 5);
            
            double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
            
            System.out.println("Now the area of pentagon is " + area);
        }
    }
}