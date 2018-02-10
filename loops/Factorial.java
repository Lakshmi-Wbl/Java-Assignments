package com.loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the factorial:");
		int x=sc.nextInt();
		System.out.println("the factiorial of the given number using recursion:"+fact_recursion(x));
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the number to find the factorial:");
		int y=sc1.nextInt();
		System.out.println("the factorial of the given number with out recursion:"+fact_nonrecursion(y));
		} 

		static int fact_recursion(int x) 
		{ 
		int z; 
		    if ((x==1)||(x==0)){ 
		    z=1; 
		    return z; 
		    } 
		    else { 
		    z= x*fact_recursion(x-1); 
		    return z; 
		    } 
		} 
		static int fact_nonrecursion(int y)
		{
			int fact=1;
			for(int i=y;i>=1;i--)
			{
				fact=fact*i;
			}
			return fact;
			
		}
		
	}

	
	


