package app;

public class Manager extends Employee {
	int teamSize;

	Manager(String name, double salary, int teamSize) {
		super(name, salary);
		this.teamSize = teamSize;
	}

	void displayTeam() { 
        displayDetails(); 
        System.out.println("Team Size: " + teamSize); 
	}
	
}
