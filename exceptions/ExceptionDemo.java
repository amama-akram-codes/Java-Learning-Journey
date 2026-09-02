package com.learnjava.exceptions;
import java.io.IOException;

class ExceptionA extends Exception {
    private static final long serialVersionUID = 1L;

    public ExceptionA(String message) {
        super(message); 
    }
}

class ExceptionB extends ExceptionA {
    private static final long serialVersionUID = 1L;

    public ExceptionB(String message) {
        super(message);
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new ExceptionA("This is ExceptionA");
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
        }
        try {
            throw new ExceptionB("This is ExceptionB");
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
        }
        try {
            String str = null;
            str.length();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
        }
        try {
            throw new IOException("This is IOException");
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
        }
    }
}