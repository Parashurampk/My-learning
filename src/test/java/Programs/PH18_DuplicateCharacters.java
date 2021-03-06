package Programs;

public class PH18_DuplicateCharacters {

	public static void main(String[] args) {
		String str = "w3schools";
		int cnt = 0;
		char[] ch = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] == ch[j]) {
					System.out.println(ch[j]);
					cnt++;
					break;
				}
			}
		}
	}
}
/*
 * Here in this program, a Java class name DuplStr is declared which is having
 * the main() method. All Java program needs one main() function from where it
 * starts executing program. Inside the main(), the String type variable name
 * str is declared and initialized with string w3schools. Next an integer type
 * variable cnt is declared and initialized with value 0. This cnt will count
 * the number of character-duplication found in the given string.
 * 
 * The statement: char [] inp = str.toCharArray(); is used to convert the given
 * string to character array with the name inp using the predefined method
 * toCharArray(). The System.out.println is used to display the message
 * "Duplicate Characters are as given below:". Now the for loop is implemented
 * which will iterate from zero till string length. Another nested for loop has
 * to be implemented which will count from i+1 till length of string.
 * 
 * Inside this two nested structure for loops, you have to use an if condition
 * which will check whether inp[i] is equal to inp[j] or not. If the condition
 * becomes true prints inp[j] using System.out.println() with s single
 * incrementation of variable cnt and then break statement will be encountered
 * which will move the execution out of the loop.
 */