package bank;

public class PremiumCustomer extends Customer{
	PremiumCustomer(String name, double purchaseAmount) {
		super(name, purchaseAmount);
	}

	@Override
	double calculateDiscount() {
		return purchaseAmount * 0.15;
	}

	void display() {
		System.out.println(name);
		System.out.println("Discount: " + calculateDiscount());
	}
}
