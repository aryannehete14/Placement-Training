package com.training.demo;

import java.util.Scanner;

public class ConditionalStatement {
	public static void main(String[] args) {
		System.out.println("Enter the age : ");

		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if (age >= 0 && age <= 5) {
			System.out.println("Baby");
		} else if (age >= 6 && age <= 12) {
			System.out.println("Child");
		} else if (age >= 13 && age <= 19) {
			System.out.println("Teenager");
		} else if (age >= 20 && age <= 50) {
			System.out.println("Adult");
		} else {
			System.out.println("Very old");
		}

	}

}
