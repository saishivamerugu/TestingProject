package Streams;

import java.util.Arrays;
import java.util.List;

public class SortedInStreams {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

        numbers.stream()
               .sorted()
               .forEach(System.out::println);
        
        List<String> names = Arrays.asList("Sai", "Ram", "Anu", "Kiran");
        names.stream()
             .sorted()
             .forEach(System.out::println);

//      Question 1: High-Value Orders Sorted After Discount
//        1️ Filter orders greater than 1000
//        2️ Apply 10% discount on those orders
//        3️ Sort the final prices in ascending order
//        4️ Print the result
        List<Integer> orders = List.of(500, 1200, 3000, 700, 2000);
        orders.stream().filter(o -> o > 1000)
        .map(o -> {
        	int discount = (o / 100) * 10;
        	return o - discount;
        }).sorted().forEach(System.out::println);
        
        // Question 2: Passed Students Names Sorted Alphabetically
        List<String> students = List.of(
        	    "Sai-85",
        	    "Ravi-35",
        	    "Anil-90",
        	    "Meena-60",
        	    "Kiran-30"
        	);
        
//        1️ Filter passed students (marks ≥ 40)
//        2️ Extract student names
//        3️ Convert names to UPPERCASE
//        4️ Sort names alphabetically
//        5️ Print the names
        
        students.stream()
        .filter(s -> {
            int marks = Integer.parseInt(s.split("-")[1]);
            return marks >= 40;
        })
        .map(s -> s.split("-")[0].toUpperCase())
        .sorted()
        .forEach(System.out::println);

        
	}
}
