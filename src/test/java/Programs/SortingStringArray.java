package Programs;

import java.util.Arrays;
import java.util.Collections;

public class SortingStringArray {

	public static void main(String[] args) {
		String arr[] = { "practice.geeksforgeeks.org", "quiz.geeksforgeeks.org", "code.geeksforgeeks.org" };

		// Sorts arr[] in ascending order
		Arrays.sort(arr);
		System.out.println("Modified arr[] : " + Arrays.toString(arr));

		// Sorts arr[] in descending order
		Arrays.sort(arr, Collections.reverseOrder());

		// Lastly printing the above array
		System.out.println("Modified arr[] :" + Arrays.toString(arr));
	}
}
