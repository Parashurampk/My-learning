package PracticePrograms;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringConcatinationLambada {

	public static void main(String[] args) {

		char[] input = { 'a', 'b', 'c', 'd', 'e' };
		final String output = IntStream.range(0, input.length).mapToObj(i -> String.valueOf(input[i]))
				.collect(Collectors.joining(""));

		System.out.println(output);

	}

}
