package com.learnjava.io;
import  java.io.IOException;
import java.util.Scanner;
public class FileWriteReadDemo {

	public static void main(String[] args) throws IOException {
    java.io.File file = null;
    java.io.PrintWriter writeFile=null;
    Scanner fileRead= null;
    try {
    	file = new java.io.File("Name.txt");
    	if(file.exists()) {
    		throw new IOException ("file already exist create a new file");
    	}
    	writeFile = new java.io.PrintWriter(file);
    	char [] name = {'A','m','a','m','a'};
    	for(char c:name) {
    		writeFile.print(c);
    	}
    	writeFile.close();
    	fileRead = new Scanner(file);
    	while(fileRead.hasNext()) {
    		String text = fileRead.next();
    		System.out.println(text);    		
    	}
    	}
      catch(IOException e) {
      System.out.println(e.toString());  
}
    finally {
    	fileRead.close();
    }
}}