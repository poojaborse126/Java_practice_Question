package com.practiceques1;

public class LibraryMemberDemo {

	public static void main(String[] args) {
		Member m = new Member("Sneha", 3);
		Library library = new Library();

		library.displayMember(m);
	}
}
