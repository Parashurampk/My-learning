package Programs;

public class CountCharacters {

	public static void main(String[] args) {

		String input = "aaabbAAAAAcccd";
		char search = 'A'; // Character to search is 'a'.

		// Example 1
		long count = input.chars().filter(ch -> ch == search).count();
		// chars() method return integer representation of codepoint values of the
		// character stream
		System.out.println("The Character '" + search + "' appears " + count + " times.");

		count = input.codePoints().filter(ch -> ch == search).count();
		// codePoints() just return the actual codepoint or Unicode values of the
		// stream.
		System.out.println("The Character '" + search + "' appears " + count + " times.");

	}

}
