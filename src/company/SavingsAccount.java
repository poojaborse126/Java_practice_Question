package company;

public class SavingsAccount extends BankAccount{
	SavingsAccount(String number, String name, double balance) {
		super(number, name, balance);
	}

	double calculateInterest() {
		return balance * 0.04;
	}
}
