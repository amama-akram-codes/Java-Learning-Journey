package com.learnjava.basics;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=234;
		
		int firstDigit=num%10;
		num=num/10;
		
		int secondDigit=num%10;
		num=num/10;
		
		int thirdDigit=num%10;
		num=num/10;
		
		int sum=firstDigit+secondDigit+thirdDigit;
		
		System.out.println("the sum is ="+sum);

	}

}
