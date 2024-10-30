package day7;

import java.util.Scanner;

public class EstruturaCondicionalIfElse2 {
	public static void main(String[] args) {
		float note1, note2, average;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first note: ");
		note1 = scanner.nextFloat();
	
		System.out.println("Enter the second note: ");
		note2 = scanner.nextFloat();
	
		average = (note1 + note2)/2;
		
		if(average >= 6) {
			System.out.println("Congratulations, you have been approved!");
		}else if(average == 5){
			System.out.println("Exam student!");
		}else {
			System.out.println("Unfortunately you failed...");
		}
	}
}
