package bank;

public class Account {

	private double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	public double getBalance() {
		return balance;
	}
}
