package day8;

import java.util.Scanner;

public class LacosDeRepeticaoFor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int calculate, numberChosen;
		
		System.out.println("Enter the number you want to see the multiplication table for: ");
		numberChosen = scanner.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			
			calculate = 2 * i;			
			System.out.println(numberChosen + " X " + i + " = " + calculate);
		}
		
	}
}
