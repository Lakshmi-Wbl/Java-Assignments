package com.Files;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BuffandInputExample {

	public static void main(String[] args) throws Exception {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.println("Enter the first number:");
		String str1=br.readLine();
		int num1=Integer.parseInt(str1);
		
		System.out.println("Enter second number:");
		String str2=br.readLine();
		int num2=Integer.parseInt(str2);
		
		int subtract=num1-num2;
		System.out.println("Result is:"+subtract);

	isr.close();
	br.close();}

	}


