package CoreJava;

public class methodFunctionsInJava {
	// main method --> starting point execution
	public static void main(String[] args) {

		methodFunctionsInJava obj = new methodFunctionsInJava();
		System.out.println(obj.pqr());
		System.out.println(obj.qa());
		System.out.println(obj.division(30, 40));
	}

	public void test() {
		System.out.println("test method");
	}

	public int pqr() { // return type is Int
		System.out.println("PQR Method");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

	public String qa() { // return type String
		System.out.println("QA method");
		String s = "Selenium";
		return s;
	}

	public int division(int x, int y) {
		System.out.println("division method");
		int d = x / y;
		return d;
	}
}
