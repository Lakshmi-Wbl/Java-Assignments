package com.loops;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a natural number to find out if its prime number:");
		int x=sc.nextInt();
		if(x==1)
			System.out.println("1 is not a prime number");
		else{
			if((x%2==0)||(x%3==0)||(x%5==0)||(x%7==0))
				System.out.println(x+" is not a prime number");
			else 
				System.out.println(x+" is a prime number");
				
		}

	}

}
