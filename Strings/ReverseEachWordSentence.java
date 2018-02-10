package com.Strings;

import java.util.Scanner;

public class ReverseEachWordSentence {

	public static void main(String[] args) {
		String sentence,rev="";
		int length;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence:");
		sentence=sc.nextLine();
		String a[]=sentence.split(" ");
	
				for(int i=0;i<a.length;i++){
					length = a[i].length();
					for (int j = length - 1; j >= 0; j--) {
						rev = rev + a[i].charAt(j);
					}
					System.out.print(rev+" ");
					rev="";
					//System.out.print(a[i] + count++ + " ");
			}
				
			
				sc.close();
			}
		


	}


