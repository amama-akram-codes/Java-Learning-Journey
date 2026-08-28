package com.learnjava.strings;

public class WordCapitalizer {

    public static String capitalize(String word) {
        return word.substring(0,1).toUpperCase() + word.substring(1);
    }

    public static void main(String[] args) {
        System.out.println(capitalize("word"));
    }
}