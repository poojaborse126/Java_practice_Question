package bank;

public class SavingsAccount extends BankAccount {

	SavingsAccount(String holder, double balance) {
		super(holder, balance);
	}

	void addInterest() {
		balance += balance * 0.04;
	}
}
