package college;

public class Manager  extends Employee1{

	String department; 
	 
    Manager(int id, String name, double salary, String department) { 
        super(id, name, salary); 
        this.department = department; 
    } 
 
    void displayManager() { 
        display(); 
        System.out.println("Department: " + department); 
    } 
}
