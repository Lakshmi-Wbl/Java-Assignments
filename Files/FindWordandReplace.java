package com.Files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FindWordandReplace {

	public static void main(String[] args) throws Exception{
		
	    FileReader file = new FileReader("Sample1.txt");
	    
	    Scanner kb = new Scanner(System.in);
	    Scanner input = new Scanner(file);
	    int count=0;
	    

	    System.out.println("Please enter the name you would like to search for: ");
	    String name = kb.nextLine();
	    FileWriter fw=new FileWriter(name);
	 //   System.out.println(name);

        String s="wow";
	    while(input.hasNextLine()) {
	    	String nextToken = input.next();
	        if (nextToken.equalsIgnoreCase(name))
	        {
	        	//count++;
	        	//System.out.println(nextToken);
	        	nextToken=nextToken.replaceAll(nextToken, s);
	        	//fw.write(nextToken);
	        	//System.out.println(nextToken);
	        	
	        }
	        
	        
	    }
	  fw.close();

}

}
