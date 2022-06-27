package Programs;

public class DuplicateWord {

	public static void main(String[] args) {
		String string = "Big black bug bit a big black dog on his big black nose";
		int count;
		string = string.toLowerCase(); // Converts the string into lowercase
		String words[] = string.split(" "); // Split the string into words using built-in function

		System.out.println("Duplicate words in a given string : ");
		for (int i = 0; i < words.length; i++) 
		{
			count = 1;
			for (int j = i + 1; j < words.length; j++)
			{
				if (words[i].equals(words[j])) {
					count++;

					words[j] = "0"; // Set words[j] to 0 to avoid printing visited word
				}
			}

			if (count > 1 && words[i] != "0") // Displays the duplicate word if count is greater than 1
				System.out.println(words[i]);
		}
	}
}