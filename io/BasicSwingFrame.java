
package com.learnjava.io;
import javax.swing.*;
public class BasicSwingFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f=new JFrame("Hello");
		f.setSize(500, 400);
		f.setVisible(true);
		JButton b1=new JButton();
		JButton b2=new JButton();
		JButton b3=new JButton();
		JButton b4=new JButton();
		JButton b5=new JButton();
		f.add(b5);
		f.add(b4);
		f.add(b3);
		f.add(b2);
		f.add(b1);
		f.setVisible(true);

	}

}