package com.CompanySpecificProblems;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int n = sc.nextInt();

		int original = n;
		int sum = 0;

		while (n > 0) {

			int d = n % 10;
			sum = sum + (d * d * d);

			n = n / 10;
		}

		if (sum == original) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not an Armstrong Number");
		}

		sc.close();
	}
}
