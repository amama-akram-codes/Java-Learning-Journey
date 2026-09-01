package com.learnjava.oop;

class BankAccount {

    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Error: Balance cannot be negative. Update rejected.");
        } else {
            this.balance = balance;
            System.out.println("Balance updated successfully to: " + this.balance);
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be positive.");
        } else {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        }
    }
}

class Rectangle {

    double length;
    double width;

    public Rectangle() {
        this.length = 0;
        this.width  = 0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width  = width;
    }

    public double getArea() {
        return length * width;
    }

    public void display() {
        System.out.println("Rectangle -> Length: " + length
                           + ", Width: " + width
                           + ", Area: " + getArea());
    }
}

class Counter {

    private static int totalCount = 0;
    private int id;

    public Counter() {
        totalCount++;          
        this.id = totalCount;  
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public void showId() {
        System.out.println("This object's ID: " + id);
    }
}

class Animal {

    public void makeSound() {
        System.out.println("Animal says: (generic animal sound)");
    }

    public void makeSound(int times) {
        System.out.print("Animal makes sound " + times + " time(s): ");
        for (int i = 0; i < times; i++) {
            System.out.print("... ");
        }
        System.out.println();
    }
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof! Woof!");
    }
}

class Student {

    String name;
    int    age;

    public Student(String name, int age) {
        this.name = name;   
        this.age  = age;
    }

    public void printInfo() {
        System.out.println("--- Student Info ---");
        this.showName();   
        this.showAge();
    }

    public void showName() {
        System.out.println("Name: " + this.name);
    }

    public void showAge() {
        System.out.println("Age : " + this.age);
    }

    public void register() {
        System.out.println("Registering student...");
        printStudentCard(this);   
    }

    public static void printStudentCard(Student s) {
        System.out.println("=== STUDENT CARD ===");
        System.out.println("Name : " + s.name);
        System.out.println("Age  : " + s.age);
        System.out.println("====================");
    }
}

public class JavaOopCoreConcepts {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("  TASK 1: Encapsulation — BankAccount");
        System.out.println("========================================");

        BankAccount account = new BankAccount();
        System.out.println("Initial balance: " + account.getBalance());

        account.setBalance(5000);       
        account.setBalance(-200);       
        account.deposit(1500);          
        account.deposit(-50);           
        System.out.println("Final balance: " + account.getBalance());

        System.out.println("\n========================================");
        System.out.println("  TASK 2: Constructors — Rectangle");
        System.out.println("========================================");

        Rectangle r1 = new Rectangle();           
        Rectangle r2 = new Rectangle(7.5, 3.0);  
        r1.display();
        r2.display();

        System.out.println("\n========================================");
        System.out.println("  TASK 3: Static Members — Counter");
        System.out.println("========================================");

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();

        System.out.println("Total Counter objects created: " + Counter.getTotalCount());

        c1.showId();
        c3.showId();

        System.out.println("\n========================================");
        System.out.println("  TASK 4: Overriding vs Overloading");
        System.out.println("========================================");

        Animal animal = new Animal();
        Dog    dog    = new Dog();

        System.out.println("-- Method Overriding --");
        animal.makeSound();   
        dog.makeSound();      

        System.out.println("\n-- Method Overloading (Animal) --");
        animal.makeSound(3);  

        Animal polymorphicDog = new Dog();
        System.out.println("\n-- Polymorphism (Animal ref → Dog object) --");
        polymorphicDog.makeSound();  

        System.out.println("\n========================================");
        System.out.println("  TASK 5: The 'this' Keyword — Student");
        System.out.println("========================================");

        Student s1 = new Student("Ali Hassan", 20);

        System.out.println("-- Using 'this' to call methods internally --");
        s1.printInfo();  

        System.out.println("\n-- Passing 'this' as argument to another method --");
        s1.register();   

        System.out.println("\n========================================");
        System.out.println("  All 5 Tasks Completed Successfully!");
        System.out.println("========================================");
    }
}