package com.practiceques1;

public class CustomerAccount {

	private String customerName;
	private double balance;

	public CustomerAccount(String customerName, double balance) {
		this.customerName = customerName;
		this.balance = Math.max(0, balance);
	}

	public String getCustomerName() {
		return customerName;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}
}
