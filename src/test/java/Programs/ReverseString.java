package Programs;

public class ReverseString 
{
	public static void main(String[] args)
	{
		String str = "GeeksForGeeks";
		char[] data = str.toCharArray();  // convert String to character array by using toCharArray

		for (int i = str.length() - 1; i >= 0; i--)
			System.out.print(data[i]);
	}
}