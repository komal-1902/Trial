package com.myabstract;

public class Rectangle extends Shape {
	
	private int length, breadth;
	
	public Rectangle() {
		length = 2;
		breadth = 3;
	}
	
	public Rectangle(int length, int breadth, String name) {
		super(name);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double area() {
		
		return (length * breadth);
	}

}
