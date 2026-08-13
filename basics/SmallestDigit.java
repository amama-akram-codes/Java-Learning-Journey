package com.learnjava.basics;
import java.util.Scanner;
public class SmallestDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		try (Scanner getvalue = new Scanner (System.in)) {
			System.out.println("Enter 1st digit");
			i= getvalue.nextInt();
			
			System.out.println("Enter 2nd digit");
			j= getvalue.nextInt();
			
			System.out.println("Enter 3rd digit");
			k= getvalue.nextInt();
		}
		
		{ 
			if(i<j && i<k)
			System.out.printf("1st digit %d  is smallest",i);
			
			else if( j<i && j<k)
				System.out.printf("2nd digit %d  is smallest",j);
			
			else
			System.out.printf("3rd digit %d  is smallest",k);
		}
	}
	}


