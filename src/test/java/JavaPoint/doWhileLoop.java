package JavaPoint;

public class doWhileLoop {

	public static void main(String[] args) {

		int i = 0;
		System.out.println("Printing the list of first 10 even numbers \n");
		do {
			System.out.println(i);
			i = i + 2;
		} while (i <= 10);
	}
}

//When the number of iteration is not known and we have to execute the loop at least once, we can use do-while loop.