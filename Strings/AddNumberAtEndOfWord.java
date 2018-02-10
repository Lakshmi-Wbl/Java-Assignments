package com.Strings;

import java.util.Scanner;

public class AddNumberAtEndOfWord {

	public static void main(String[] args) {
		String sentence;
		int count=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		sentence=sc.nextLine();
		String a[]=sentence.split(" ");
	
				for(int i=0;i<a.length;i++){
			        System.out.print(a[i] + count++ + " ");
			}
			
				sc.close();
			}
		

	}


