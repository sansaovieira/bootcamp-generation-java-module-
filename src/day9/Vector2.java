package day9;

import java.util.Arrays;
import java.util.Scanner;

public class Vector2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int vetorInteiros[] = new int[5];

		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println("\nEnter the" + (i + 1) + "° number: ");
			vetorInteiros[i] = scanner.nextInt();
		}

		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println((i + 1) + "º element: " + vetorInteiros[i]);
		}
		
		System.out.println("Vector size: " + vetorInteiros.length);
		
		Arrays.sort(vetorInteiros);
		
		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println((i + 1) + "º element: " + vetorInteiros[i]);
		}
	}

}
