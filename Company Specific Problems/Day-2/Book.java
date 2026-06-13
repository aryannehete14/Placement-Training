package com.demo;

//Question: Book Class (Library System)

//Objective:
//Define a class named Book that represents a book in a library.
//
//Attributes:
//- title (String): title of the book
//- author (String): author of the book
//- year (int): year the book was published
//- available (boolean): status indicating whether the book is available or not
//
//Methods:
//- Constructor: to initialize all the attributes of the book
//- displayDetails(): prints the details of the book including title, author, year, and availability
//
//Tasks:
//1. Create at least two objects of the Book class with different attribute values.
//2. Initialize the values using the constructor.
//3. Display the details of each book using the displayDetails() method.
//4. Display those books that are available.
//5. Display that book which has maximum price.

public class Book {

	String strTitle;
	String strAuthor;
	int iYear;
	boolean bAvailable;
	float price;

	Book(String strTitle, String strAuthor, int iYear, boolean bAvailable, float price) {
		this.strTitle = strTitle;
		this.strAuthor = strAuthor;
		this.iYear = iYear;
		this.bAvailable = bAvailable;
		this.price = price;
	}

	void display() {
		System.out.println("Title      : " + strTitle);
		System.out.println("Author     : " + strAuthor);
		System.out.println("Year       : " + iYear);
		System.out.println("Available  : " + bAvailable);
		System.out.println("Price ₹    : " + price);
	}

	void displayAvailableBooks(Book[] books) {

		System.out.println("\n=== Available Books ===");

		for (Book b : books) {
			if (b.bAvailable) {
				b.display();
				System.out.println("--------------------");
			}
		}
	}

	void max_price_book(Book[] books) {

		Book max = books[0];

		for (int iCount = 0; iCount < books.length; iCount++) {
			if (books[iCount].price > max.price) {
				max = books[iCount];
			}
		}

		System.out.println("\nBook with Maximum Price ₹:");
		System.out.println("--------------------");
		max.display();
	}

	public static void main(String[] args) {

		Book book1 = new Book("Java Basics", "James Gosling", 2020, true, 699.99f);
		Book book2 = new Book("GOATED", "Helicopter Delulu", 2022, false, 769.67f);
		Book book3 = new Book("Formula 1", "Lewis Hamilton", 2026, true, 1000.00f);

		Book[] books = { book1, book2, book3 };

		System.out.println("=== All Books ===");

		for (Book b : books) {
			b.display();
			System.out.println("--------------------");
		}

		book1.displayAvailableBooks(books);
		book1.max_price_book(books);
	}
}