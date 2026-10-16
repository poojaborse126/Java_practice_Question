package com.practiceques;

public class MarksDemo {

	public static void main(String[] args) { 
        
		MarksCalculator m = new MarksCalculator(); 
 
        int total = m.calculateTotal(80, 75, 90); 
 
        System.out.println("Total: " + total); 
 
 
        System.out.println("Average: " + m.calculateAverage(total)); 
    } 
}
