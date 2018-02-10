package com.loops;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 3 didgit number to be checked:");
		int n= sc.nextInt();
		int c=0,a,temp;  
	     
	    temp=n;  
	    while(n>0)  
	    {  
	    a=n%10;  
	    n=n/10;  
	    c=c+(a*a*a);  
	    }  
	    if(temp==c)  
	    System.out.println("armstrong number");   
	    else  
	        System.out.println("Not armstrong number");   

	}

}
