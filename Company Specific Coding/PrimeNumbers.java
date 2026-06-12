package com.CompanySpecificProblems;

// Create a program that generates and stores all prime numbers up to a given number in a list.
// Input : 
// A positive integer
// Logic : 
// - Write a function that checks if a number is prime.
// - Use a loop to generate all prime numbers up to n and store them in a list.
// Output : 
// Display the list of prime numbers.
// Challenge :
// Prompt the user to enter a positive integer n.

import java.util.*;

public class PrimeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Positive Integer: ");

		int n = sc.nextInt();

		List<Integer> primes = new ArrayList<>();

		for (int i = 2; i <= n; i++) {
			int count = 0;

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				primes.add(i);
			}
		}

		System.out.println(primes);

		sc.close();
	}
}