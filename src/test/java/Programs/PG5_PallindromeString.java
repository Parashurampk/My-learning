package Programs;

import java.util.Scanner;

public class PG5_PallindromeString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		int str = scanner.nextInt();
		int org_num = str;
		int rev = 0;
		while (str != 0) {
			rev = rev * 10 + str % 10;
			str = str / 10;
		}

		if (org_num == rev) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not Pallindrome");
		}
	}
}


