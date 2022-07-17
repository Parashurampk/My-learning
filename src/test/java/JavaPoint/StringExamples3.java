package JavaPoint;

public class StringExamples3 {

	public static void main(String[] args) {
		
		String str="javatpoint is a very good website";  
		String	replcestr=str.replace('a', 'e');
		System.out.println(replcestr);
		
		String	replcestr2=str.replace("is", "was");
		System.out.println(replcestr2);
		
		String replaceall2=str.replaceAll("v","k");
		System.out.println(replaceall2);
		
		String replaceString=str.replaceAll("\\s",""); //remove the white space
		System.out.println(replaceString);
		
		String strrr = "JavaTpoint";
		String regex = "";  
		str = strrr.replaceAll(regex, " ");    
		System.out.println(str);  
		
		String s1="java string split method by javatpoint";  
		String[] words=s1.split("\\s");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		for(String w:words){  
		System.out.println(w);  
		}  
		
		
		String strk = "Javatpointtt";  
        System.out.println("Returning words:");  
        String[] arr = strk.split("t", 0);  
        for (String w : arr) {  
            System.out.println(w);  
        }  
        System.out.println("Split array length: "+arr.length); 

        
        String s1111="Javatpoint";    
        String substr = s1111.substring(0); // Starts with 0 and goes to end  
        System.out.println(substr);  
        String substr2 = s1111.substring(5,10); // Starts from 5 and goes to 10  
        System.out.println(substr2);    
	}
	
	

}
