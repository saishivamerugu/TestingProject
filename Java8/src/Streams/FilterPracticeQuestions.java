package Streams;

import java.util.List;

public class FilterPracticeQuestions {
	public static void main(String[] args) {
		
		// QUestion 1 : Print only ACTIVE users.
		List<String> users = List.of(
			    "ACTIVE: Sai",
			    "INACTIVE: Ravi",
			    "ACTIVE: Anil",
			    "BLOCKED: John"
			);
		
		users.stream()
					.filter(user -> user.startsWith("ACTIVE"))
					.forEach(System.out::println);
		
		// Question 2 : Filter Orders Above Certain Amount
		List<Integer> orderAmounts = List.of(500, 1200, 800, 3000, 450);
		orderAmounts.stream()
						.filter(amt -> amt > 1000)
						.forEach(System.out::println);
		
		// Question 3: Filter Failed Students (College System)
		List<Integer> marks = List.of(35, 67, 90, 28, 40, 22);
		marks.stream()
					.filter(mark -> mark < 45)
					.forEach(System.out::println);
		
		// Question 4: Filter Employees from IT Department (HR System)
		List<String> employees = List.of(
			    "Sai-IT",
			    "Ravi-HR",
			    "Anil-IT",
			    "Meena-FINANCE"
			);
		employees.stream()
						.filter(employee -> employee.endsWith("IT"))
						.forEach(System.out::println);
		
		// Question 5: Filter Valid Email IDs (Registration System)
		List<String> emails = List.of(
			    "sai@gmail.com",
			    "ravi@yahoo.com",
			    "admin@gmail.com",
			    "test@outlook.com"
			);
		
		emails.stream()
					.filter(email -> email.contains("@gmail.com"))
					.forEach(System.out::println);
	}
}
