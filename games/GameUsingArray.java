package com.learnjava.games;

public class GameUsingArray {
	    public static void main(String[] args) {

	        int[] deck = new int[52];
	        String[] suits = {"Spade", "Heart", "Diamond", "Club"};
	        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	        for (int i = 0; i < 52; i++) {
	            deck[i] = i;
	        }
	        for (int i = 0; i < 52; i++) {
	            int randomIndex = (int) (Math.random() * 52);
	            int temp = deck[i];
	            deck[i] = deck[randomIndex];
	            deck[randomIndex] = temp;
	        }

	        for (int i = 0; i < 4; i++) {
	            String suit = suits[deck[i] / 13];
	            String rank = ranks[deck[i] % 13];
	            System.out.println("Card " + (i + 1) + ": " + rank + " of " + suit);
	        }
	    }
	}
