package com.practiceques;

public class BookDemo {

	public static void main(String[] args) {
		Book b = new Book();
		b.title = "Java Programming";
		b.author = "James";
		b.price = 650;

		b.displayBook();
	}
}
