package company;

public class MiniBankingDemo {
	public static void main(String[] args) {
		SavingsAccount savings = new SavingsAccount("SA101", "Rahul", 10000); 
	 
		CurrentAccount current = new CurrentAccount("CA201", "Priya", 25000); 
	 
	    savings.deposit(2000); 
	    savings.withdraw(1000); 
	    
	    current.deposit(5000); 
	    current.withdraw(2000); 
	 
	    System.out.println("Savings Account"); 
	    savings.display(); 
	    System.out.println("Interest: Rs. " + savings.calculateInterest()); 
	 
	    System.out.println("\nCurrent Account"); 
	    current.display(); 
	     
	}
}
