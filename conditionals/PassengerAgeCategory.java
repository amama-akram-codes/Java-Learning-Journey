package com.learnjava.conditionals;
import java.util.Scanner;
public class PassengerAgeCategory {


		public static void main(String[] args) {
			
			int age=0;
			try (Scanner input = new Scanner(System.in)) {
				System.out.println("Enter age of passenger.");
				age= input.nextInt();
			}
			if(age>0 && age<2)
			{
				System.out.println("Passenger is infant.");
			}
			else if(age>=2 && age<18)
			{
				System.out.println("Passenger is child.");
			}
			else
			{
				System.out.printf("Person is adult.");
			}
	  }
		}   

}
