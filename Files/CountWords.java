package com.Files;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountWords {

	    public static void main (String args[]) throws Exception {

		       System.out.println ("Number of Words in the file:");       
		       FileReader fr = new FileReader ("Sample1.txt");        
		       BufferedReader br = new BufferedReader (fr);     
		       String line = br.readLine();
		       int count = 0;
		       while (line != null) {
		          String []parts = line.split(" ");
		          for( String w : parts)
		          {
		            count++;        
		          }
		          line = br.readLine();
		       }         
		       System.out.print(count);
		       br.close();
		    }

	}
