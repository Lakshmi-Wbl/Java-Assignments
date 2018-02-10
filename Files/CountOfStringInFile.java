package com.Files;

import java.io.File;

import java.util.Scanner;

public class CountOfStringInFile {

	public static void main(String[] args) throws Exception{
		
		    File file = new File("Sample1.txt");
		    Scanner kb = new Scanner(System.in);
		    Scanner input = new Scanner(file);
		    int count=0;

		    System.out.println("Please enter the name you would like to search for: ");
		    String name = kb.nextLine();
		 //   System.out.println(name);


		    while(input.hasNextLine()) {
		    	String nextToken = input.next();
		        if (nextToken.equalsIgnoreCase(name))
		        {
		        	count++;
		        }
		        
		    }
		    System.out.println("Number of times the word occurred:"+count);

	}

}
