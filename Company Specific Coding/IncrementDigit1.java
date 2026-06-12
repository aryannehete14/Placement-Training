package com.CompanySpecificProblems;

public class IncrementDigit1 {

	public static int incrementDigits(int iNum) {

		int iRes = 0;
		int position = 1;

		while (iNum != 0) {

			int digit = iNum % 10;
			int newDigit = (digit + 1) % 10;

			iRes = iRes + (newDigit * position);

			position = position * 10;	
			iNum = iNum / 10;
		}

		return iRes;
	}

	public static void main(String[] args) {

		int num = 123;
		System.out.println(incrementDigits(num));
	}
}