package com.learnjava.datetime;
import java.util.Scanner;
public class DayOfWeekCalculator {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in)) {
			System.out.print("Ënter the day of date 1:");
			int dayOnFirst=input.nextInt();
			//String firstDay=input.nextLine();
			System.out.print("Ënter any date of the month:");
			
			int date=input.nextInt();
			//int dayNumber=0;
			
				switch((date+dayOnFirst-1)%7) {
				case 1:
					System.out.println("Day  is Monday");
					break;
				case 2:
					System.out.println("Day number is Tuesday");
					break;
				case 3:
					System.out.println("Day number is wednesday");
					break;
				case 4:
					System.out.println("Day number is thursday");
					break;
				case 5:
					System.out.println("Day number is friday");
					break;
				case 6:
					System.out.println("Day number is saturday");
					break;
				case 0:
					System.out.println("Day number is sunday");
					break;
					default:
						System.out.println("Invalid day.");
				}
			
			
				{ switch((date+dayOnFirst-1)%7) {
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
						System.out.println("Weekday");
						break;
					case 6:
					case 0:
						System.out.println("Weekend");
						break;
						default:
							System.out.println("Invalid day.");
				}
				}
		}
	}}
			
			
				
			