package com.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a={12,23,45,67,5,68};
		int search=5;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
				System.out.println("the number you are searching for is in "+i+"th position");
			
		}

	}

}
