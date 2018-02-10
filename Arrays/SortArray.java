package com.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] arr={17,45,65,23,41,2};
		int n=arr.length;
		int temp=0;
		//sorting the array
		for(int i=0;i<n;i++){
			for(int j=1;j<(n-i);j++){
			if(arr[j-1]>arr[j]){
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
								}		
				}
				}
		//displaying the sorted array
		for(int k=0;k<n;k++){
			System.out.println(arr[k]);
		}


	}

}
