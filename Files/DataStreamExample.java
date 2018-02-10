package com.Files;

import java.io.DataInputStream;

public class DataStreamExample {

	public static void main(String[] args) throws Exception {
		DataInputStream dis = new DataInputStream(System.in);
		
		System.out.println("Enter the first number:");
		int i1 = dis.readInt();
		
		System.out.println("Enter the second number:");
		int i2 = dis.readInt();
		
		int mul=i1*i2;
		System.out.println("Multiplication result is:"+mul);
		
		dis.close();
		

	}

}
