/* Constructor Chaining (product ,ElectronicProduct) */
package bank;

public class Product {
	String name;
	double price;

	Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	void display() {
		System.out.println(name);
		System.out.println(price);
	}
}
