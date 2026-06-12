package com.CompanySpecificProblems;

import java.util.Scanner;

public class IncrementDigit {
	public static void main(String[] args) {
		System.out.println("Enter an integer : ");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int digit;
		int result = 0;
		int multiplier = 1;

		while (n > 0) {

			digit = n % 10;
			digit = digit + 1;

			result = (digit * multiplier) + result;

			n = n / 10;
			multiplier = multiplier * 10;
		}

		System.out.println(result);

		sc.close();
	}
}