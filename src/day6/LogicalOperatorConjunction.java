package day6;

import java.util.Scanner;

public class LogicalOperatorConjunction {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		 
        boolean age, ticket, response, parents;
 
        System.out.println("\nLet's check access to the club: ");
 
        System.out.println("Do you have the ticket? ");
        ticket = read.nextBoolean();
 
        System.out.println("Age greater than or equal to 18? ");
        age = read.nextBoolean();
        
        System.out.println("Are you related to the owner? ");
        parents = read.nextBoolean();
        
        response = age && ticket || parents;
        System.out.println("Access: " + response+ "!");
        
        read.close();

	}
}
