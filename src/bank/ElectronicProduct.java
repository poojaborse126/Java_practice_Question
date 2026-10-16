package bank;

public class ElectronicProduct extends Product {
	int warrantyYears;

	ElectronicProduct(String name, double price, int warrantyYears) {
		super(name, price);
		this.warrantyYears = warrantyYears;
	}

	void displayWarranty() {
		display();
		System.out.println("Warranty: " + warrantyYears + " years");
	}
}
