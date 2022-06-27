package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12, 3, 24, 5, 3, 23, 5, 44, 25, 10);
		
		//get first 5 numbers -> sum of 5 numbers 
		List<Integer>l=list.stream().limit(5).collect(Collectors.toList());
		System.out.println(l);
		
		int sum=list.stream().limit(5).reduce((p,q)->p+q).get();
		System.out.println("Sum of first five numbers is : "+sum);
		
		//skip:
		List<Integer> sk=list.stream().skip(5).collect(Collectors.toList());
		System.out.println("Sum of remaining numbers is : "+sk);
		
		int sumsk=list.stream().skip(5).reduce((p,q)->p+q).get();
		System.out.println("Sum of remaining numbers is : "+sumsk);
		
	}

}
