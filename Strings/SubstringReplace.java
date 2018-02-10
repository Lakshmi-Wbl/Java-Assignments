package com.Strings;

import java.util.Scanner;

public class SubstringReplace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str= sc.nextLine();
		System.out.println("Enter the substring:");
		String substr = sc.nextLine();
		System.out.println("Enter the string to replace:");
		String replace=sc.nextLine();
		String newstring=str.replace(substr, replace);
		System.out.println(newstring);
		sc.close();
	}

	
	}


