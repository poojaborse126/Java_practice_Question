package bank;

public class BankTypesDemo {

	public static void main(String[] args) {
		SavingsAccount a = new SavingsAccount("Rahul", 10000);
		a.deposit(2000);
		a.addInterest();
		a.display();
	}
}
