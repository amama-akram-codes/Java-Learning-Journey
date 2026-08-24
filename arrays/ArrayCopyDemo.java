package com.learnjava.arrays;
public class ArrayCopyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int [] marks = {39,95,92,88,75};
       int[] copyMarks = new int[marks.length];
       for(int i=0;i< marks.length;i++) {
    	   copyMarks[i]=marks[i];
       }
       for(int val: copyMarks) {
    	   System.out.println(val);

       }

}}