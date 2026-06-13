package com.CompanySpecificProblems;

//Write a program to generate and display the multiplication table up to 10 from 1-10.

public class Multiplication2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.printf("%d×%d=%-4d", j, i, j * i);
			}
			System.out.println();
		}
	}
}
