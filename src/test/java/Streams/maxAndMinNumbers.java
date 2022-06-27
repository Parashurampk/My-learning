package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class maxAndMinNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12, 3, 24, 5, 3, 23, 5, 44, 25, 10);
		int	max=list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Maximum number is : "+max);
		
		int	min=list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Minimum number is : "+min);

	}

}
