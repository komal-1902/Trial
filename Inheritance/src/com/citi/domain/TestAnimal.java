package com.citi.domain;

public class TestAnimal {

	public static void main(String[] args) {
		
		Animal dog = new Dog("Dog");
		dog.makeSound();
		Animal cat = new Cat("Cat");
		cat.makeSound();
		Animal elephant = new Elephant("Elephant");
		elephant.makeSound();

	}

}
