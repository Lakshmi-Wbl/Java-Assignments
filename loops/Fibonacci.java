package com.loops;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of fibonacci numbers to be printed");
		int x=sc.nextInt();
		int a=0,b=1,fab;
		System.out.print(a+" "+b);
		for(int i=0;i<(x-2);i++)
		{
			fab=a+b;
			System.out.print(" "+fab);
			a=b;
			b=fab;	
		}

	}

}
