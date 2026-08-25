package com.learnjava.arrays;
import java.util.ArrayList;
import java.util.Collections;

       public class ArrayListMaxFinder {
	    public static void main(String[] args) {
	        ArrayList<Integer> l1 = new ArrayList<>();
	        Collections.addAll(l1, 4, 9, 100, 112, 1032);
	        
	      
	        ArrayList<Integer> l2 = new ArrayList<>();
	        Collections.addAll(l2, 5, 16, 332, 4152, 8);
	      
	      
	        ArrayList<Integer> l3 = new ArrayList<>();
	        Collections.addAll(l3, 7, 8, 9, 1032, 444, 592);
	        
	        System.out.println("l1  max: " + Collections.max(l1)); 
	        System.out.println("l2  max: " + Collections.max(l2));   
	        System.out.println("l3  max: " + Collections.max(l3)); 	 
	     
	        ArrayList<Integer> allLists = new ArrayList<>();
	        allLists.addAll(l1);
	        allLists.addAll(l2);
	        allLists.addAll(l3);
	        
	        
	        
	        System.out.println("Largest number of all three lists: " + Collections.max(allLists));
	    }
	
	        }
	

