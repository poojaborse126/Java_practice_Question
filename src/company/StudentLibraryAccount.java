package company;

public class StudentLibraryAccount extends LibraryAccount{
	int rollNo;

	StudentLibraryAccount(String name, int books, int rollNo) {
		super(name, books);
		this.rollNo = rollNo;
	}

	void displayStudentAccount() {
		display();
		System.out.println("Roll No: " + rollNo);
	}
}
