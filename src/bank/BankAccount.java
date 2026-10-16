package bank;

public class BankAccount {

	protected String holder;
	protected double balance;

	BankAccount(String holder, double balance) {
		this.holder = holder;
		this.balance = balance;
	}

	void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	void display() {

		System.out.println(holder + ": Rs. " + balance);
	}
}


