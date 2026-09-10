package com.learnjava.gui;
import javax.swing.*;
import java.awt.*;

public class BorderLayoutCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator Layout");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JTextField f = new JTextField();
        f.setFont(new Font("Arial", Font.PLAIN, 24));
        f.setEditable(false);
        frame.add(f, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 5, 5)); 

        JButton b1 = new JButton("C");
        JButton b2 = new JButton("√");
        JButton b3 = new JButton("x²");
        JButton b4 = new JButton("÷");

        JButton b5 = new JButton("7");
        JButton b6 = new JButton("8");
        JButton b7 = new JButton("9");
        JButton b8 = new JButton("×");

        JButton b9 = new JButton("4");
        JButton b10 = new JButton("5");
        JButton b11 = new JButton("6");
        JButton b12 = new JButton("-");

        JButton b13 = new JButton("1");
        JButton b14 = new JButton("2");
        JButton b15 = new JButton("3");
        JButton b16 = new JButton("+");

        JButton b17 = new JButton("0");
        JButton b18 = new JButton(".");
        JButton b19 = new JButton("=");

     
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);

        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);

        panel.add(b9);
        panel.add(b10);
        panel.add(b11);
        panel.add(b12);

        panel.add(b13);
        panel.add(b14);
        panel.add(b15);
        panel.add(b16);

        panel.add(b17);
        panel.add(b18);
        panel.add(b19);

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}