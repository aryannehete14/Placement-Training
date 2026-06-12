package com.CompanySpecificProblems;

import java.util.Scanner;

// Given a string, determine if it is a Palindrome.
// Special characters.
// Solve in O(1) extra space and O(n) time complexity.

// Input Values  : 
// 1.madam
// 2.racecar
// 3.Z
// 4.""	

public class Palindrome1 {
	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		str = str.toLowerCase();

		int left = 0;
		int right = str.length() - 1;

		boolean isPalindrome = true;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				isPalindrome = false;
				break;
			}
			left++;
			right--;
		}

		if (isPalindrome) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

		sc.close();
	}
}