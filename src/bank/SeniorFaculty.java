package bank;

public class SeniorFaculty extends Faculty {
	int experience;

	SeniorFaculty(String name, String subject, int experience) {
		super(name, subject);
		this.experience = experience;
	}

	void display() { 
        System.out.println(name); 
        System.out.println(subject); 
        System.out.println(experience);
	}
}
