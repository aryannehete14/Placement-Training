package com.CompanySpecificProblems;

import java.util.*;

public class Palindrome3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		Stack<Character> stack = new Stack<>();

		int mid = str.length() / 2;

		for (int i = 0; i < mid; i++) {
			stack.push(str.charAt(i));
		}

		int secondHalfStart;
		if (str.length() % 2 == 0) {
			secondHalfStart = mid;
		} else {
			secondHalfStart = mid + 1;
		}

		boolean isPalindrome = true;

		for (int i = secondHalfStart; i < str.length(); i++) {

			if (stack.pop() != str.charAt(i)) {
				isPalindrome = false;
				break;
			}
		}

		if (isPalindrome) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

		sc.close();
	}
}