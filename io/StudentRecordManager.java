package com.learnjava.io;
import java.util.*;
import java.io.*;

public class StudentRecordManager {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (PrintWriter writer = new PrintWriter("students.txt")) {
            while (true) {
                System.out.print("Enter roll number (0 to stop): ");
                int roll = sc.nextInt();
                if (roll == 0) break;
                System.out.print("Enter name: ");
                String name = sc.next();
                System.out.print("Enter marks: ");
                int marks = sc.nextInt();
                writer.println(roll + " " + name + " " + marks);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            return;
        }

       
        int maxMarks = -1;
        String maxName = "";
        int maxRoll = -1;
        try (Scanner fileSc = new Scanner(new File("students.txt"))) {
            while (fileSc.hasNext()) {
                int roll = fileSc.nextInt();
                String name = fileSc.next();
                int marks = fileSc.nextInt();
                if (marks > maxMarks) {
                    maxMarks = marks;
                    maxName = name;
                    maxRoll = roll;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading from file: " + e.getMessage());
            return;
        }

        if (maxMarks != -1) {
            System.out.println("Student with maximum marks: Roll Number " + maxRoll + ", Name: " + maxName);
        } else {
            System.out.println("No students entered.");
        }
    }
}