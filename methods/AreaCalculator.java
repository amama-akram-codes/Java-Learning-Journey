package com.learnjava.methods;
import java.util.Scanner;
public class AreaCalculator {


    public static double calculateArea(double r) {
        return Math.PI * r * r;
    }

    public static double calculateArea(double l, double w) {
        return l * w;
    }

    public static double calculateArea(String type, double b, double h) {
        return 0.5 * b * h;
    }

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
			System.out.println("1. Circle\n2. Rectangle\n3. Triangle");
			int ch = input.nextInt();

			switch (ch) {
			    case 1:
			        System.out.print("Radius: ");
			        System.out.println("Area = " + calculateArea(input.nextDouble()));
			        break;

			    case 2:
			        System.out.print("Length & Width: ");
			        System.out.println("Area = " + calculateArea(input.nextDouble(), input.nextDouble()));
			        break;

			    case 3:
			        System.out.print("Base & Height: ");
			        System.out.println("Area = " + calculateArea("triangle", input.nextDouble(), input.nextDouble()));
			        break;

			    default:
			        System.out.println("Wrong choice");
			}
		}
    }
}
