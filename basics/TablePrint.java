package com.learnjava.basics;
import java.util.Scanner;
public class TablePrint {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
	  Scanner input = new Scanner(System.in)) {
		System.out.println("Enter any number between 1 to 20:");
		  int n=input.nextInt();
		  System.out.println("Table of "+ n + " is:");
			for(int i=1; i<=10; i++) {
				System.out.println(n+"x"+i+"="+(n*i));
}
	  }
      
	}
	static void display(int n) {
		System.out.println("Table of"+ n + "is:");
		for(int i=1; i<=10; i++) {
			System.out.println(n+"x"+i+"="+(n*i));
}
}}