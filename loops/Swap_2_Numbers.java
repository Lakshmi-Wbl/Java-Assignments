package com.loops;

import java.util.Scanner;

public class Swap_2_Numbers {

	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter first number x to be swapped:");
		int x=sc1.nextInt();
		System.out.println("Enter second number y to be swapped:");
		int y=sc1.nextInt();
		swapwithvariable(x,y);
	    swapwithoutvariable(x,y);
		
	}
		
	 public static void swapwithvariable(int x,int y)
	  {
		  int z;
			z=x;
			x=y;
			y=z;
			System.out.println("The swapped number x is:"+x);
			System.out.println("The swapped number y is:"+y);
	  }
	  public static void swapwithoutvariable(int x,int y)
	  {
		  x=x+y;
			y=x-y;
			x=x-y;
			System.out.println("The swapped number x is:"+x);
			System.out.println("The swapped number y is:"+y);
	  }

}

