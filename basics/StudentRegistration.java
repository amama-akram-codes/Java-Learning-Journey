package com.learnjava.basics;

import java.util.Scanner;

public class StudentRegistration {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter your full name:");
            String name = input.nextLine();
            
            System.out.println("Enter your registration number (numbers only):");
            int regNum = input.nextInt();
            input.nextLine();
            
            System.out.println("Enter your degree program:");
            String degree = input.nextLine();
            
            System.out.println("Enter your Grade:");
            char grade = input.next().charAt(0);

            System.out.println("\n--- Registration Details ---");
            System.out.println("Name: " + name);
            System.out.println("Reg No: " + regNum);
            System.out.println("Degree: " + degree);
            System.out.println("Grade: " + grade);
        }
    }
}