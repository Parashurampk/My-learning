package JavaPoint;

public class WhileLoop {

	public static void main(String[] args) {

		int i = 0;
		System.out.println("Printing the list of first 10 even numbers \n");
		while (i <= 10) {
			System.out.println(i);
			i = i + 2;
		}
	}
}
//if we don't know the number of iterations in advance, it is recommended to use a while loop.