package com.learnjava.arrays;

public class SwapArrays {
	
	public static void main(String[] args) {
		int val1=45;
		int val2=30;
		 System.out.println("value of v1 and v2 before swapping ="+val1+", "+val2);
		 swap(val1,val2);
		 System.out.println("value of v1 and v2 after swapping="+val1+","+val2);
	    
	    int value[]= {45,30};
	    System.out.println("value before calling  swapp array method ");
	    for(int v:value) {
	 	   System.out.println(v);
	    }
	 	 
	    swapArray(value);
	    
	    System.out.println("value after  calling  swapp array method ");
	    for(int v:value) {
	 	   System.out.println(v);
	    }
	    }
		

	public static void swap(int v1, int v2) {
		int temp=v1;
		 v1= v2;
		 v2=temp;
		 System.out.println("value of v1 and v2 in the swap method ="+v1+", "+v2);}
		 {
		
	}
public static void swapArray(int[]v) {
	int temp=v[0];
	v[0]=v[1];
	v[1]=temp;
	System.out.println("value in the  swapp array method ");
	for(int value:v) {
		System.out.println(value);
		}
	}
}