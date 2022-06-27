package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumbers {

	public static void main(String[] args) {
		
		List<Integer>list= Arrays.asList(12,3,4,5,7,83,44,2,10);
		List<Integer>evenlist=list.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println("Even numbers is :"+evenlist);
		
		List<Integer>oddlist=list.stream().filter(e->e%2==1).collect(Collectors.toList());
		System.out.println("Odd numbers is :"+oddlist);
	}

}
