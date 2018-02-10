package com.Arrays;

public class CommonNumber {

	public static void main(String[] args) {
		int[] a={5,56,67,3,4,0,21};
		int[] b={45,23,1,4,6,68,56};
		System.out.println("The common numbers are:");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j])
					{
					System.out.println(a[i]);
					}
			}
		}
		

	}

}
