package com.Strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string to check whether palindrome or not:");
		String string1=sc.nextLine();
		int len=string1.length();
		String string2="";
		
		for(int i=len-1;i>=0;i--){
			string2=string2+string1.charAt(i);
		}
		System.out.println("string1:"+string1);
		System.out.println("string2:"+string2);
		if(string1.equals(string2)){
			System.out.println("The word "+ string1+" is palindrome");
		}
		else{
			System.out.println("The word "+string1+" is not palindrome");
		}

	sc.close();}


	}


