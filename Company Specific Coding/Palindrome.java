package com.CompanySpecificProblems;

import java.util.Scanner;

// Given a string, determine if it is a Palindrome.
// Special characters.

// Input Values  : 
// 1.madam
// 2.racecar
// 3.Z
// 4.""

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		str = str.toLowerCase();
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		if (str.equals(reverse)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

		sc.close();
	}
}