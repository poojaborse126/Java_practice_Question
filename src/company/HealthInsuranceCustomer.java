package company;

public class HealthInsuranceCustomer extends InsuranceCustomer{

	HealthInsuranceCustomer(String name, double amount) {
		super(name, amount);
	}

	@Override
	double calculatePremium() {
		return insuredAmount * 0.04;
	}

	void display() {
		System.out.println(name);
		System.out.println("Premium: " + calculatePremium());
	}
}
