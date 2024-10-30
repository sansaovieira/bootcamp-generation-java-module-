package day7;

import java.util.Scanner;

public class EstruturaCondicionalSwitchCase {
	public static void main(String[] args) {

		int opcao;
		Scanner leia = new Scanner(System.in);

		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
		System.out.println("\n--Press 1 to see Book Recommendation--");
		System.out.println("--Press 2 to see a Motivational Quote read--");
		System.out.println("--Press 3 to receive a Song Suggestion--");
		opcao = leia.nextInt();

		switch (opcao) {
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
		}
	}
}
