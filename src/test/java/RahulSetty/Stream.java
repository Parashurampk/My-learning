package RahulSetty;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Stream {

//	@Test
	public void regular() {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijith");
		names.add("Don");
		names.add("Akihil");
		names.add("Adam");
		names.add("Ram");
		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
	}

	@Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijith");
		names.add("Don");
		names.add("Akihil");
		names.add("Adam");
		names.add("Ram");
		// there is no life for intermediate operation if there is no terminal
		// operation.
		// terminal operation will execute only if intermediate operation return true.
		// we can create stream
		// how to use filler in Stream API

		Long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);

		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));

	}
}
