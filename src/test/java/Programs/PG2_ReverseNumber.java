package Programs;

public class PG2_ReverseNumber {

	public static void main(String[] args) {
		int num = 987654;
		int rev = 0;
		while (num != 0) {
			int remainder = num % 10;
			rev = rev * 10 + remainder;
			num = num / 10;
		}
		System.out.println("The reverse of the given number is: " + rev);
	}
}