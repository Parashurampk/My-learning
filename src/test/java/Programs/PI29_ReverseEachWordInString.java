package Programs;

public class PI29_ReverseEachWordInString {

	public static void main(String[] args) {
		
	/*	String str="Welcome to java and selenium training";  
		String[] words=str.split(" ");
		String reverseString="";
		for(String w:words)
		{
			String reverseword="";
			
			for(int i=w.length()-1;i>=0;i--)
			{
				reverseword=reverseword+w.charAt(i);
			}
			
			reverseString=reverseString+reverseword+" ";
		}
		System.out.println(reverseString);
	}

}*/
		String str="Welcome to java and selenium training";  
		String[] words=str.split(" ");
		String reverseword="";
		
		for(String w: words)
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			
			reverseword=reverseword+sb.toString()+" ";
		}
		System.out.println(reverseword);

	}
}