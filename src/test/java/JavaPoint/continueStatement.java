package JavaPoint;

public class continueStatement {

	public static void main(String[] args) {

		for (int i = 0; i <= 2; i++) {

			for (int j = i; j <= 5; j++) {

				if (j == 4) {
					continue;
				}
				System.out.println(j);
			}
		}
	}

}

//it skips the specific part of the loop and jumps to the next iteration of the loop immediately.