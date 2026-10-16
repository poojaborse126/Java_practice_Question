package com.practiceques1;

public class Doctor extends HospitalStaff{

	Doctor(String name, String department) { 
        super(name, department); 
    } 
 
    void display() { 
        System.out.println(name); 
        System.out.println(department); 
    }
}
