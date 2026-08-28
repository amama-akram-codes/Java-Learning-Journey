package com.learnjava.strings;

public class LetterCounter {
    public static int countLetters(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)))
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countLetters("Hello World"));
    }
}