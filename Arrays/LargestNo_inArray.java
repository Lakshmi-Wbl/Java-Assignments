package com.Arrays;

public class LargestNo_inArray {

	public static void main(String[] args) {
		int[] arr={23,45,56,43,12,0,100};
		int largest=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>largest){
				largest=arr[i];
			}
		}
		System.out.println("Largest number is "+largest);
	}

	}


