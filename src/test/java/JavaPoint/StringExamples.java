package JavaPoint;

public class StringExamples {

	public static void main(String[] args) {

		String str = "JavaPoint";
		char ch = str.charAt(4); // returns the char value at the 4th index
		System.out.println(ch);

		
		System.out.println(str.charAt(0)); // Fetching first character
		System.out.println(str.charAt(str.length() - 1)); // The last Character is present at the string length-1 index

		
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			 if (str.charAt(i) == 't')
				count++;
		}
		System.out.println(count);

	}
}