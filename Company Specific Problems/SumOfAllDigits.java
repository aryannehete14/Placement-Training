package com.CompanySpecificProblems;

import java.util.*;

// Write a program to calculate the sum of digits of a given positive integer.
// Input : Prompt the user to enter a positive integer.
// Output : Display the sum of digits.
// Logic : Use a for loop to iterate through each digit of the number and calculate the sum.

public class SumOfAllDigits {

	public static boolean isPositive(int n) {
		if (n < 1) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Positive Integer : ");
		int n = sc.nextInt();

		if (isPositive(n)) {
			int sum = 0;

			for (; n > 0; n = n / 10) {
				sum = sum + (n % 10);
			}

			System.out.println("Sum of Digits = " + sum);
		} else {
			System.out.println("Please Enter a Positive Integer");
		}

		sc.close();
	}
}
