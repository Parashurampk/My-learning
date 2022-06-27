package TestPackages;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWayToIterateList {

	public static void main(String[] args) {

		List<String> courses = Arrays.asList("C", "Java", "SQL", "Spring");

		System.out.println("1.for loop :");
		// for loop
		for (int i = 0; i < courses.size(); i++) {
			System.out.println(courses.get(i));
		}
		
		System.out.println("2.Enhanced for each loop :");
		// Enhanced for each loop
		for (String cx : courses) {
			System.out.println(cx);
		}
		
		System.out.println("3.basic loop  with iterator :");
		//basic loop  with iterator
		for (Iterator iterator = courses.iterator(); iterator.hasNext();) {
			String course = (String) iterator.next();
			System.out.println(course);
		}
		
		System.out.println("4.Iterator with while loop :");
		//Iterator with while loop
		Iterator<String> it = courses.iterator();
		while (it.hasNext()) {
			String course = (String) it.next();
			System.out.println(course);
			
		}
		
		System.out.println("5.java 8 stream +lambda example:");
		//java 8 stream +lambda example
		courses.stream().forEach(course->System.out.println(course));
		
		
		System.out.println("6.java 8 for each loop +lambda example:");
		//java 8 for each loop +lambda example
		courses.forEach((course)->System.out.println(course));
	}
}