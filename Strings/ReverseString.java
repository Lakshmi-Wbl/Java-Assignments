package com.Strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String string, rev="";
		int length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to reverse:");
		string = sc.nextLine();
		length = string.length();
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + string.charAt(i);
		}
		System.out.println(rev);
        sc.close(); 
		}
}