package day6;

import java.util.Scanner;

public class LogicalOperatorDisjunction {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		 
        boolean age, present_mother, response;
 
        System.out.println("Let's check cinema access: ");
        System.out.println("Age greater than or equal to 18? ");
        age = read.nextBoolean();
 
        System.out.println("Is your mother present? ");
        present_mother = read.nextBoolean();
 
        response = age || present_mother;
        
        System.out.println("Acess " + response+ "!");
        
        read.close();
	}
}
