package com.learnjava.basics;
import java.util.Scanner;

public class TicketPriceCalculator {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter customer's age: ");
			int age = input.nextInt();

			System.out.print("Enter destination distance in Kilometers: ");
			double distance = input.nextDouble();

			double ticketPrice;
			
			int ageCategory = (age < 12) ? 1 : (age <= 60) ? 2 : 3;

			switch (ageCategory) {
			    case 1:
			        ticketPrice = distance * 20;
			        break;
			    case 2:
			        ticketPrice = distance * 50;
			        break;
			    case 3:
			        ticketPrice = distance * 10;
			        break;
			    default:
			        ticketPrice = distance * 50;
			        break;
			}

			System.out.println("The total ticket price is: " + ticketPrice + " RS");
		}
    }
}