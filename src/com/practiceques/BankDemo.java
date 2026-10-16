package com.practiceques;

public class BankDemo {

	public static void main(String[] args) {
		BankAccount a = new BankAccount("Rahul", 10000);
		a.deposit(2000);
		a.displayBalance();
	}
}
