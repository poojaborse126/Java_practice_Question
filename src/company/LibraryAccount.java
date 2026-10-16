/* LibraryAccount , StudentLibraryAccount, LibraryAccountDemo*/
package company;

public class LibraryAccount {

	String memberName;
	int booksIssued;

	LibraryAccount(String memberName, int booksIssued) {
		this.memberName = memberName;
		this.booksIssued = booksIssued;
	}

	void display() {
		System.out.println(memberName);
		System.out.println(booksIssued);
	}
}
