package com.learnjava.geometry;
import java.util.Scanner;
public class RegularPentagonCalculator {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the radius of pantagon:");
			double radius= input.nextDouble();
			double side=2*radius*Math.sin(Math.PI/5);
			 double Area=(5*(side+(side)))/(4*(Math.PI/5));
			System.out.println("Now the area of pantagon is "+ Area);
		}
		

	}

}
