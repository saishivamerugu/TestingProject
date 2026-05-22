package Streams;

import java.util.List;

public class MapsPraciceQuestions {

	public static void main(String[] args) {
		
		// Question 1: Convert Names to Uppercase (User Display)
		List<String> names = List.of("sai", "ravi", "anil");
		names.stream()
				.map(name -> name.toUpperCase())
				.forEach(System.out::println);
		
//		Question 2: Apply Bonus to Salaries (Payroll System)
		List<Integer> salaries = List.of(25000, 30000, 40000);
		salaries.stream().map(salary -> salary + 5000).forEach(System.out::println);
		
//		Question 3: Extract Domain Names from Emails
		List<String> emails = List.of(
			    "sai@gmail.com",
			    "admin@yahoo.com",
			    "test@outlook.com"
			);
		emails.stream()
	      .map(email -> email.substring(email.indexOf("@") + 1))
	      .forEach(System.out::println);

//		Question 4: Passed Students Names in Uppercase
		List<String> students = List.of(
			    "Sai-85",
			    "Ravi-35",
			    "Anil-90",
			    "Meena-30"
			);
		
//		1️ Filter passed students (marks ≥ 45)
//		2️ Convert names to UPPERCASE
//		3️ Print names only
		students.stream()
        .filter(student -> {
            int marks = Integer.parseInt(student.split("-")[1]);
            return marks >= 40;
        })
        .map(student -> student.split("-")[0].toUpperCase())
        .forEach(System.out::println);

		// Question 5: Discounted Prices (E-commerce)
		List<Integer> prices = List.of(500, 1200, 3000, 700);

		prices.stream()
		      .filter(price -> price > 1000)
		      .map(p -> {
		          int discount = p * 10 / 100;
		          return p - discount;
		      })
		      .forEach(System.out::println);

//		Question 6: Valid Gmail Usernames
		List<String> email = List.of(
			    "sai@gmail.com",
			    "ravi@yahoo.com",
			    "admin@gmail.com"
			);
		email.stream().filter(emaile -> emaile.endsWith("gmail.com")).map(m -> {
			return m.split("@")[0];
		}).forEach(System.out::println);
		
	}
}
