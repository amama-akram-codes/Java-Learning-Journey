package com.learnjava.basics;
import java.util.Scanner;
public class ReverseNumbers {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
	Scanner getvalue = new Scanner(System.in)) {
		System.out.println("Enter number");
		int number=getvalue.nextInt();
		System.out.printf("the number is %d\n",number);
		int lastDigit=(number%10);
		int secondlastDigit=(number/10)%10;
		int thirdlastDigit=(number/100)%10;
		int reversedNumber=lastDigit*100+secondlastDigit*10+thirdlastDigit*1;
		System.out.printf("The new number is %d\n",reversedNumber);
			if (number==reversedNumber)
				System.out.println("Number is Palindrome.");
			else
				System.out.println("Number is not Palindrome.");
	}

	}

}
