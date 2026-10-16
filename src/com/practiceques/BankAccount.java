package com.practiceques;

public class BankAccount {

	String holder;
	double balance;

	BankAccount(String holder, double balance) {
		this.holder = holder;
		this.balance = balance;
	}

	void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	void displayBalance() {

		System.out.println(holder + ": Rs. " + balance);
	}
}
