package com.OOPS;

public class Triangle extends Shape{
     
	private final double a, b, c; // sides
	
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double calculateArea(double a, double b, double c)
    {
    	return a*b*c;
    }
	@Override
	double calculateArea(double h,double b) {
		
		return (b*h)/2;
	}

	@Override
	double calculatePerimeter(double a, double b, double c) {
		
		return a+b+c;
	}

}
