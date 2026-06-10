package com.training.demo;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int numberToGuess = rand.nextInt(100) + 1;
		int numberOfTries = 0;

		boolean hasGuessedCorrectly = false;
		System.out.println("Welcome to the Guessing Game!!");

		while (!hasGuessedCorrectly) {
			System.out.println("Enter your guess : ");
			int guess = sc.nextInt();

			numberOfTries++;

			if (guess > numberToGuess) {
				System.out.println("Number Guessed is Too High.");
			

			}else if(guess < numberToGuess) {
				System.out.println("Number Guessed is Too Low.");
			}else {
				hasGuessedCorrectly = true;
				System.out.println("You have correctly guess the number");
				System.out.println("Number of guesses : " + numberOfTries);
			}

		}
	}

}
