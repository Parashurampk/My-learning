package Programs;

public class PI21_RemoveWhiteSpace {

	public static void main(String[] args) {

		String str = "      Geeks     for    Geeks        ";

		str = str.replaceAll("\\s", ""); // Call the replaceAll() method

		System.out.println(str);
	}
}