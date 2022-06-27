package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith {

	public static void main(String[] args) {
		
		List<Integer>numbers= Arrays.asList(12,3,24,5,7,23,44,25,10);
		List<Integer>numwith2=numbers.stream().map(e->String.valueOf(e)).filter(e ->e.startsWith("2")).map(Integer::valueOf).collect(Collectors.toList());
		System.out.println("Numbers strts with 2 are :"+numwith2);
	}

}
