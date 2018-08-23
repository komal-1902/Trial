package com.citi.domain;

public class Dog extends Animal {
	
	public Dog(String name) {
		super(name);
	}

	@Override
	void makeSound() {
		System.out.println("Bark");

	}

	@Override
	void displayLifeSpan() {
		System.out.println("10 years");

	}

}
