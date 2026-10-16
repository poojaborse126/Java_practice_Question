package app;

import bank.Account;

public class BankDemo {

	public static void main(String[] args) {
		Account a = new Account(5000);
		a.deposit(1000);

		System.out.println(a.getBalance());
	}
}
