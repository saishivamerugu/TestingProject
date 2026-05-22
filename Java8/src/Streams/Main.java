package Streams;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10,20,30,40);
		numbers.stream()
		.filter(n -> n % 2 == 0)
		.forEach(System.out::println);
		
		List<String> names = Arrays.asList("Sai", "Ram", "Kiran", "Anu");
		names.stream()
		     .filter(name -> name.startsWith("K"))
		     .forEach(System.out::println);

		
	}
}
