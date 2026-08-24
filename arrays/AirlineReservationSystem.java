package com.learnjava.arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AirlineReservationSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] seats = new String[20];
        boolean running = true;

        while (running) {
            System.out.println("Please type 1 for Business Class (Seats 1-8) or 2 for Economy (Seats 9-20):");

            try {
                int choice = input.nextInt();
                input.nextLine(); 

                if (choice != 1 && choice != 2) {
                    System.out.println("Invalid input! Please type 1 or 2.");
                    continue;
                }

                boolean seatAssigned = false;

                if (choice == 1) {
                   
                    seatAssigned = assignSeat(seats, 0, 8, "Business Class", input);
                    if (!seatAssigned) {
                        System.out.println("Business Class full. Would you like Economy? (yes/no)");
                        String response = input.nextLine();
                        if (response.equalsIgnoreCase("yes")) {
                            seatAssigned = assignSeat(seats, 8, 20, "Economy", input);
                            if (!seatAssigned) {
                                System.out.println("Economy also full. Next flight leaves in 3 hours.");
                                running = false;
                            }
                        } else {
                            System.out.println("Next flight leaves in 3 hours.");
                            running = false;
                        }
                    }
                } else {
                    seatAssigned = assignSeat(seats, 8, 20, "Economy", input);
                    if (!seatAssigned) {
                        System.out.println("Economy full. Would you like Business Class? (yes/no)");
                        String response = input.nextLine();
                        if (response.equalsIgnoreCase("yes")) {
                            seatAssigned = assignSeat(seats, 0, 8, "Business Class", input);
                            if (!seatAssigned) {
                                System.out.println("Business Class also full. Next flight leaves in 3 hours.");
                                running = false;
                            }
                        } else {
                            System.out.println("Next flight leaves in 3 hours.");
                            running = false;
                        }
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number (1 or 2).");
                input.nextLine(); 
            }
        }

        System.out.println("\nFinal Seating Chart:");
        for (int i = 0; i < seats.length; i++) {
            System.out.println("Seat " + (i + 1) + ": " + (seats[i] == null ? "Empty" : seats[i]));
        }

        input.close();
    }

    public static boolean assignSeat(String[] seats, int start, int end, String section, Scanner input) {
        for (int i = start; i < end; i++) {
            if (seats[i] == null) {
                System.out.println("Enter passenger name for " + section + ":");
                String name = input.nextLine();
                seats[i] = name;
                System.out.println("Boarding Pass: Seat " + (i + 1) + " - " + section);
                return true;
            }
        }
        return false; 
    }
}