/* BankAccount,SavingsAccount, CurrentAccount, CurrentAccount,MiniBankingDemo*/
package company;

public class BankAccount {
	private String accountNumber;
	private String holderName;
	protected double balance;

	BankAccount(String accountNumber, String holderName, double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = Math.max(0, balance);
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			return true;
		}
		return false;
	}

	public double getBalance() {
		return balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void display() {
		System.out.println("Account: " + accountNumber);
		System.out.println("Holder: " + holderName);
		System.out.println("Balance: Rs. " + balance);
	}
}

