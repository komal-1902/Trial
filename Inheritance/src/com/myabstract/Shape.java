package com.myabstract;

abstract public class Shape {
	
	String name;
	
	public Shape() {
		name = "No name";
	}
	
	public Shape(String name) {
		this.name = name;
	}
	
	public void description() {
		System.out.println("Name: " + name);
	}

	abstract public double area();
	
}
