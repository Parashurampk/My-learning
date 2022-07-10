package Programs;

public class PG3_ReverseString 
{
	public static void main(String[] args)
	{
	
   //1.Using string concatenation operator
		
		String str= "Welcome";
		String rev="";
		int len=str.length();  //4
		
        for (int i=len-1;i>=0; i--)  //3 2 1 0 -1
        {
        	rev=rev+str.charAt(i);	//DCBA
        }
        System.out.println("Reversed word: "+ rev);
    }
}

/*   //2.Using character array
		
		char a[]=str.toCharArray();
		int len=a.length;
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("Reversed word: "+ rev);   
		
		
	//3.Using String buffer class
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());        

    }
}    
	

*/










