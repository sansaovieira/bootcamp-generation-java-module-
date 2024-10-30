package day8;

import java.util.Scanner;

public class LacosDeRepeticaoWhile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean continueE;
		
		System.out.println("\n++++++++++++++++MENU++++++++++++++++++");
		System.out.print("\nWant to use our sum calculator? (s/n): ");
		continueE = scanner.next().equalsIgnoreCase("s");
		System.out.println("++++++++++++++++++++++++++++++++++");

		while(continueE) {
			System.out.println("Enter the first value: ");
			int number1 = scanner.nextInt();
			
			System.out.println("Enter the second value");
			int number2 = scanner.nextInt();
			
			int resul = number1 + number2;
			System.out.println("The result of the sum is between: " + number1 + " and " + number2 + " is: " + resul);
		
			System.out.println("\n++++++++++++++++MENU++++++++++++++++++");
			System.out.print("\nWant to use our sum calculator? (s/n): ");
			continueE = scanner.next().equalsIgnoreCase("s");
			System.out.println("++++++++++++++++++++++++++++++++++");

		}
	}

}
