package bank;

public class Vehicle {

	String brand;
	double rate;

	Vehicle(String brand, double rate) {
		this.brand = brand;
		this.rate = rate;
	}

	double calculateRent(int days) {
		return rate * days;
	}
}
