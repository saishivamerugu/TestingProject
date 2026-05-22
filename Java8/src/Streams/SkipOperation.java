package Streams;

import java.util.Arrays;
import java.util.List;

public class SkipOperation {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        numbers.stream()
               .skip(2)
               .forEach(System.out::println);
	}
}
