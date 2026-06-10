package com.training.demo;

import java.util.Scanner;

public class AtmDenomination {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] denominations = { 500, 200, 100, 50 };

		System.out.print("Enter amount: ");
		int amount = sc.nextInt();

		System.out.println("\nBreakdown for amount :");

		for (int note : denominations) {

			int count = amount / note;

			if (count > 0) {
				System.out.println(note + " x " + count);
				amount = amount % note;
			}
		}

		if (amount > 0) {
			System.out.println("Remaining amount : " + amount);
		}

		sc.close();
	}
}
