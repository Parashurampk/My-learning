package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLowestHighestNumber {

	public static void main(String[] args) {

		// sec Highest:
		List<Integer> list = Arrays.asList(12, 3, 24, 5, 3, 23, 5, 44, 25, 10);
		int secH = list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
		System.out.println("Second highest number is  : " + secH);

		// sec lowest:
		int secL = list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println("Second lowest number is  : " +secL);
	}

}
