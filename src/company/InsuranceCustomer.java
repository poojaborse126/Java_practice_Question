/* InsuranceCustomer,  HealthInsuranceCustomer,  InsuranceCustomerDemo*/
package company;

public class InsuranceCustomer {

	String name;
	double insuredAmount;

	InsuranceCustomer(String name, double insuredAmount) {
		this.name = name;
		this.insuredAmount = insuredAmount;
	}

	double calculatePremium() {
		return insuredAmount * 0.02;
	}
}
