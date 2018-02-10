package com.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		int[] a={12,3,5,1,56};
		int[] b={45,56,3,7,89};
		int[] c=new int[a.length+b.length];
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
			count++;
		}
		for(int j=0;j<b.length;j++)
		{
			c[count++]=b[j];
		}
		System.out.println("The merged array is:");
		for(int k=0;k<c.length;k++)
		{
			System.out.print(c[k]+" ");
		}
			
			
			

	}

}
