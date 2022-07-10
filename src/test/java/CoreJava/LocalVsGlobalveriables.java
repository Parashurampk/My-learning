package CoreJava;

public class LocalVsGlobalveriables {

	// Global variables--class variables
	String name = "Tom";
	int age = 25;
	static int age1 = 50;

	public static void main(String[] args) {

		int i = 10;// local variable for main method
		System.out.println(i);

		LocalVsGlobalveriables obj = new LocalVsGlobalveriables();
		System.out.println(obj.name);
		System.out.println(obj.age);

		System.out.println(LocalVsGlobalveriables.age1);// class.variable nam

	}

	public int sum() {
		int i = 10; // local variable for sum method
		int j = 20;
		int age = 25;
		return age;
	}

}
