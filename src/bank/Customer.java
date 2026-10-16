/*Constructor-Chaining  Customer and Premium Customer  PremiumCustomerDemo */

package bank;

public class Customer {
	String name;
	double purchaseAmount;

	Customer(String name, double purchaseAmount) {
		this.name = name;
		this.purchaseAmount = purchaseAmount;
	}

	double calculateDiscount() {
		return 0;
	}
}
