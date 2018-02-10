package com.OOPS;

public class TestTriangle {

	public static void main(String[] args) {
		double a = 5, b = 3, c = 4;
		int noOfsides=3;
        Triangle triangle = new Triangle(a,b,c);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c);
        System.out.println("Resulting Area: " + triangle.calculateArea(a, b));
        System.out.println("Resulting Perimeter: " + triangle.calculatePerimeter(a,b,c) + "\n");
        //Overloading
        System.out.println("Resulting Area: " + triangle.calculateArea(a, b, c));
	}

}
