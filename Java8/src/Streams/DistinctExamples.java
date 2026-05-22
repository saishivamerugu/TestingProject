package Streams;

import java.util.Arrays;
import java.util.List;

public class DistinctExamples {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        numbers.stream()
               .distinct()
               .forEach(System.out::println);
        
        List<String> names = Arrays.asList("Sai", "Ram", "Sai", "Anu");
        names.stream()
             .distinct()
             .forEach(System.out::println);

        List<Integer> nums = Arrays.asList(20, 30, 5 ,1, 40);
        nums.stream()
        .filter(x -> x > 10)     // lazy, per element
        .distinct()              // uses HashSet
        .map(x -> x * 2)         // lazy
        .sorted()                // collects all, sorts
        .forEach(System.out::println);
	}
}
