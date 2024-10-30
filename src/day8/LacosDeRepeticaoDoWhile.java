package day8;

import java.util.Scanner;

public class LacosDeRepeticaoDoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
        String userCorrect = "admin";
        String passwordCorrect = "12345";
        boolean authenticated = false;
        
       do {
    	   System.out.print("Enter username: ");
           String user = scanner.nextLine();

           System.out.print("Enter password: ");
           String password = scanner.nextLine();
           
           if(user.equals(userCorrect) && password.equals(passwordCorrect)) {
           		System.out.println("Authentication successful! Welcome!.");
           } else {
        	   System.out.println("Incorrect username or password. Try again.");
        	   System.out.println("Do you want to try again? (y/n): ");
        	   String continueE = scanner.next().toUpperCase();
        	   	if(continueE.equals("S")) {
        	   		authenticated = true;
        	   		scanner.nextLine();
        	   	} else {
        	   		authenticated = false;
        	   		System.out.println("Can't you, huh!?");
        	   	}
           }
           
       } while(authenticated);
        

	}

}
