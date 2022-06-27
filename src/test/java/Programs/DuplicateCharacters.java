package Programs;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String str = "Great responsibility";  
        int count;   
        char string[] = str.toCharArray(); //Converts given string into character array  
        System.out.println("Duplicate characters in a given string: ");  
    
        for(int i = 0; i <string.length; i++) {      //Counts each character present in the string  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;   
                    string[j] = '0';    //Set string[j] to 0 to avoid printing visited character  
                }  
            }           
            if(count > 1 && string[i] != '0')   //A character is considered as duplicate if count is greater than 1   
                System.out.println(string[i]);  
        }  
    }  
}     
