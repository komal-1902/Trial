package com.citi.domain;

public class Elephant extends Animal {
	
	public Elephant(String name) {
		super(name);
	}

	@Override
	void makeSound() {
		System.out.println("Trumpet");

	}

	@Override
	void displayLifeSpan() {
		System.out.println("100 years");

	}

}
