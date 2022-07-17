package Programiz;

import java.util.Scanner;

public class JavaInputOutput {

	public static void main(String[] args) {
		
		// create an object of Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		
		// take input from the user
		int number = input.nextInt();
		System.out.println("You entered " + number);
		

		// closing the scanner object
		input.close();
	}
}