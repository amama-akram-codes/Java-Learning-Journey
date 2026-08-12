package com.learnjava.basics;
import java.util.Scanner;

public class BasicStudentGradeCalculator {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=0;
		
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter marks of English:");
			int eng= input.nextInt();
			
			System.out.println("Enter marks of Maths:");
			int maths= input.nextInt(); 
			
			System.out.println("Enter marks of Physics:");
			int phy= input.nextInt();
			
			double avg =(eng + maths + phy)/3;
			double totalMarks= (eng + maths + phy);
			double percentage=(totalMarks/300)*100;
			System.out.println("Avarage="+avg);
			System.out.println("Percentage="+percentage);
			
			
			
				if(percentage>=90)
					System.out.println("Grade is A.");
				else if(percentage>=80)
					System.out.println("Grade is B.");
				else if(percentage>=70)
					System.out.println("Grade is C.");
				else if(percentage>=60)
					System.out.println("Grade is D.");
				else 
					System.out.println("Grade is F.");
		}
		
				
				

				

	}

}
