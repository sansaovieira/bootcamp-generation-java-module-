package day7;

import java.util.Scanner;

public class EstruturaCondicionalSwitchCase2 {
	public static void main(String[] args) {

		int option;
		Scanner scanner = new Scanner(System.in);

		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");

		System.out.println("\n--Press 1 to see Book Recommendation--");
		System.out.println("--Press 2 to see a Motivational Quote read--");
		System.out.println("--Press 3 to receive a Song Suggestion--");
		option = scanner.nextInt();

		switch (option) {
		case 1:
			System.out.println("Book: The Alchemist");
			break;
		case 2:
			System.out.println(
                "Motivational phrase: If you fall, get up! You can't walk lying down.");
			break;
		case 3:
			System.out.println("Music: AURORA - No Cure For Me.");
			break;
		default:
			System.out.println("Opção inválida!");
		}
	}
}
