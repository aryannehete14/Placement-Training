package com.training.demo;

class Smartphone1 {
	String brand;
	String model;
	int storage;

	// No parameter Constructor
	public Smartphone1() {
		this.brand = "Unknown";
		this.model = "Generic";
		this.storage = 128;
		System.out.println("No parameterised constructor called");
	}

	// Parameterized Constructor
	public Smartphone1(String brand, String model, int storage) {
		this.brand = brand;
		this.model = model;
		this.storage = storage;
		System.out.println("Parameterised constructor called");
	}

	// Constructor Overloading
	public Smartphone1(String brand, String model) {
		this(brand, model, 256);
		System.out.println("Overloaded parameterised constructor called");
	}

	public void display() {
		System.out.println("Specs " + brand + " " + model + " " + storage + " gb\n");
	}
}

public class Constructors {
	public static void main(String[] args) {
		System.out.println("=== Object Creation ===");
		System.out.println("Non-Parameterised Constructor");
		Smartphone1 s1 = new Smartphone1();
		s1.display();

		System.out.println("Parameterised Constructor");
		Smartphone1 s2 = new Smartphone1("Samsung","S26 Ultra",512);
		s2.display();

		System.out.println("Overloaded Constructor");
		Smartphone1 s3 = new Smartphone1("Vivo","IQOO 15R");
		s3.display();
	}
}
