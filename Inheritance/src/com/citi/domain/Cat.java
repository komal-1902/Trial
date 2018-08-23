package com.citi.domain;

public class Cat extends Animal {
	
	public Cat(String name) {
		super(name);
	}

	@Override
	void makeSound() {
		System.out.println("Meow");

	}

	@Override
	void displayLifeSpan() {
		System.out.println("15 years");

	}

}
