package day6;

import java.util.Scanner;

public class InputOutput {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int age;
		String name;
		
		System.out.println("Enter your age: ");
		age = read.nextInt();
		
		System.out.println("Enter your name: ");
		read.skip("\\R?");   
		name = read.nextLine();
		
		System.out.println("Your age is: " + age + " and his name is: " + name );
		
		read.close();

	}
}
