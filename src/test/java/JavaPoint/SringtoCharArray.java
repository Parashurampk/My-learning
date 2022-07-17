package JavaPoint;

public class SringtoCharArray {

	public static void main(String[] args) {
		String s1 = "Welcome to Javatpoint";
		char[] ch = s1.toCharArray();
		int len = ch.length;
		System.out.println("Char Array length: " + len);
		System.out.println("Char Array elements: ");
		for (int i = 0; i < len; i++) {
			System.out.println(ch[i]);
		}

		System.out.println("*************************************");

		String s12 = "JAVATPOINT HELLO stRIng";
		String s1lower = s12.toLowerCase();
		System.out.println(s1lower);

		System.out.println("*************************************");

		String s13 = "hello string";
		String s1upper = s13.toUpperCase();
		System.out.println(s1upper);
		
		System.out.println("*************************************");
		
		String s14="  hello string   ";  
		System.out.println(s14+"javatpoint");//without trim()  
		System.out.println(s14.trim()+"javatpoint");//with trim()  
		  

	}

}
