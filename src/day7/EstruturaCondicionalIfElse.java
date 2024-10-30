package day7;

import java.util.Scanner;

public class EstruturaCondicionalIfElse {

	public static void main(String[] args) {
		float nota1, nota2, media;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first note: ");
		nota1 = scanner.nextFloat();
		
		System.out.println("Enter the second note: ");
		nota2 = scanner.nextFloat();
		
		media = (nota1 + nota2)/2;
		
		if(media >= 6) {
			System.out.println("Congratulations, you have been approved.!");
		}else {
			System.out.println("Unfortunately you failed...");
		}
	}

}
