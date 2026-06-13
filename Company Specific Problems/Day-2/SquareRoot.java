package com.demo;

import java.util.Scanner;

// Find the square root of a number
// Write a program that takes a number as input and prints its square root (Without using Math Function)
public class SquareRoot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();

		int i = 1;
		while (i * i <= num) {
			if (i * i == num) {
				System.out.println("Square Root : " + i);
				return;
			}
			i++;
		}
		System.out.println("Not a perfect square");

	}

}
