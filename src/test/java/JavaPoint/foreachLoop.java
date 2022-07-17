package JavaPoint;

public class foreachLoop {

	public static void main(String[] args) {

		String[] names = { "Java", "C", "C++", "Python", "JavaScript" };
		System.out.println("Printing the content of the array names:\n");
		for (String str : names) {
			System.out.println(str);
		}
	}
}

//Java provides an enhanced for loop to traverse the data structures like array or collection. 
//In the for-each loop, we don't need to update the loop variable