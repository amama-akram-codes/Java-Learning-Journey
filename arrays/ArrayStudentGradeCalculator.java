package com.learnjava.arrays;

public class ArrayStudentGradeCalculator {

    public static void main(String[] args) {
        
        String [][] studentData = {
            {"Ali", "87", "91", "93"},
            {"Ahmed", "78", "67", "58"},
            {"Akram", "85", "77", "81"},
            {"Anam", "57", "41", "53"}   
        };
        
        for (int i = 0; i < studentData.length; i++) {
            String name = studentData[i][0];
            
            int marks1 = Integer.parseInt(studentData[i][1]);
            int marks2 = Integer.parseInt(studentData[i][2]);
            int marks3 = Integer.parseInt(studentData[i][3]);
            
            int total = marks1 + marks2 + marks3;
            
            double average = calculateAverage(marks1, marks2, marks3);
            double percentage = percentageCalculate(total);
            char grade = calculateGrade(percentage);
            
            System.out.println("Student: " + name + " | Average: " + average + " | Grade: " + grade);
        }
    }

    static double calculateAverage(int marks1, int marks2, int marks3) {
        return (marks1 + marks2 + marks3) / 3.0; 
    }
    
    static double percentageCalculate(int total) {
        return (total / 300.0) * 100;
    }
    
    static char calculateGrade(double percentage) {
        if (percentage >= 90)
            return 'A'; 
        else if (percentage >= 80)
            return 'B';
        else if (percentage >= 70)
            return 'C';
        else if (percentage >= 60)
            return 'D';
        else
            return 'F';
    }
}