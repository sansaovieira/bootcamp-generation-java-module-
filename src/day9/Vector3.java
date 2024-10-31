package day9;

import java.util.Arrays;

public class Vector3 {

	public static void main(String[] args) {

		String grupoA[] = { "Amanda", "Elen", "Vinicius" };
		String grupoB[] = { "Samantha", "Letícia", "Alan" };

		System.out.println("Are the arrays the same?");
		
		if(Arrays.equals(grupoA, grupoB)) {
			System.out.println("Yes! They are the same!");
		} else {
			System.out.println("They are not the same!");
		}

	}

}
