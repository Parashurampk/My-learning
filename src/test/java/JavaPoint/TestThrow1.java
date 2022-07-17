package JavaPoint;

public class TestThrow1 {

	public static void main(String args[]) {
		// calling the function
		vlaidateAge(19);
		System.out.println("rest of the code...");

	}

	public static void vlaidateAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("not eligible"); //The Java throw keyword is used to throw an exception explicitly.
		} else {
			System.out.println("elgible");
		}

	}

}
//We specify the exception object which is to be thrown. The Exception has some message with it that provides the error description.
// These exceptions may be related to user inputs, server, etc.