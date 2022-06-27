package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12, 3, 24, 5, 3, 23, 5, 44, 25, 10);
		List<Integer>sortedList=list.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted number list are : "+sortedList);
		
		
		List<Integer>reveseList=list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("Reverse sorted number list are : "+reveseList);
		

	}

}
