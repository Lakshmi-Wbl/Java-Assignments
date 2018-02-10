package com.Files;

import java.io.Console;

public class ConsoleExample {

	public static void main(String[] args)throws Exception {
		Console console = System.console();
		
		System.out.println("Enter the first number:");
		String s1 = console.readLine();
		int i1 = Integer.parseInt(console.readLine());
		
		System.out.println("Enter the second number:");
		String s2 = console.readLine();
		int i2 = Integer.parseInt(console.readLine());
		
		int div=i1/i2;
		System.out.println("Division result is:"+div);
		

	}

}
