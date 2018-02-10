package com.loops;

import java.util.Scanner;

public class Print_Fizz_Buzz {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked:");
		int num=sc.nextInt();
		if((num%3==0)&&(num%5==0))
			System.out.println("fizz buzz");
		else
		{
			if((num%3==0)&&(num%5!=0))
				System.out.println("fizz");
		    else
		      {
			   if((num%3!=0)&&(num%5==0))
				System.out.println("buzz");
			   else 
				System.out.println(num);   
		      }
		}		
		
		

	}

}
