package com.training.demo;

public class typecasting {

	public static void main(String[] args) {

		System.out.println("String to int");

		String numString = "12340";

		int n1 = Integer.parseInt(numString);
		System.out.println("Parse int method 1 : " + n1 + " (math check: " + (n1 + 1) + ")");

		int n2 = Integer.valueOf(numString);
		System.out.println("Parse int method 2: " + n2 + " (math check: " + (n2 + 1) + ")");

		String invalidString = "123abc";

		try {
			int badnumber = Integer.parseInt(invalidString);
		} catch (NumberFormatException e) {
			System.out.println("Error : Cannot convert " + invalidString + " to int.");
		}
	}
}
