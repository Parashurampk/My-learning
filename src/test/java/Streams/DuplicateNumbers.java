package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(12, 3, 24, 5, 3, 23, 5, 44, 25, 10);
//		Set<Integer> dup=list.stream().filter(e -> Collections.frequency(list, e)>1).collect(Collectors.toSet());
//		System.out.println("List of duplicate numbers are :"+dup);

		Set<Integer> dupNum = new HashSet<Integer>();
		Set<Integer> dup = list.stream().filter(e -> !dupNum.add(e)).collect(Collectors.toSet());
		System.out.println("List of duplicate numbers are :" + dup);
	}

}
