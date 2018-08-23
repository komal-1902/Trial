package com.citi.domain;

abstract public class Animal {
	
	String name;
	
	Animal(){
		this.name = "No name";
	}
	
	Animal(String name){
		this.name = name;
	}
	
	abstract void makeSound();
	abstract void displayLifeSpan();

}
