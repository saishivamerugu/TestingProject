package DateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        
        // 1 Convert LocalDate → String (Formatting)
        LocalDate date = LocalDate.of(2026, 2, 14);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = date.format(formatter);
        
        System.out.println("Formatted Date: " + formattedDate);
        // LocalDate date = LocalDate.of(2026, 2, 14);
        // Creates: 2026-02-14 (ISO format)
        // DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Pattern: dd=Day, MM=Month, yyyy=Year
        // String formattedDate = date.format(formatter);
        // Converts LocalDate → String
        // Output: 14/02/2026
        
        // ------------------------------
        
        // 2 Convert String → LocalDate (Parsing)
        String input = "14/02/2026";
        
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parsedDate = LocalDate.parse(input, formatter2);
        
        System.out.println("Parsed Date: " + parsedDate);
        // LocalDate.parse(input, formatter2);
        // Converts String → LocalDate
        // Input: "14/02/2026"
        // Output: 2026-02-14 (stored in ISO format internally)
        
        // ------------------------------
        
        // Why We Need Formatter?
        // LocalDate.parse("14/02/2026");  // ERROR! ❌
        // Default parse() expects: yyyy-MM-dd format only
        
        // ------------------------------
        
        // Most Important Patterns (Memorize These)
        System.out.println("\nCommon Date Patterns:");
        
        // Pattern: dd/MM/yyyy
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("dd/MM/yyyy: " + date.format(fmt1));  // 14/02/2026
        
        // Pattern: yyyy-MM-dd (ISO)
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("yyyy-MM-dd: " + date.format(fmt2));  // 2026-02-14
        
        // Pattern: dd-MM-yyyy
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("dd-MM-yyyy: " + date.format(fmt3));  // 14-02-2026
        
        // Pattern: MM/dd/yyyy (US format)
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println("MM/dd/yyyy: " + date.format(fmt4));  // 02/14/2026
        
        // ------------------------------
        
        // Real Backend Example (Student Management System)
        String dobInput = "20/05/2001";  // User enters this format
        
        DateTimeFormatter dobFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dob = LocalDate.parse(dobInput, dobFormatter);
        
        System.out.println("Student DOB Input: " + dobInput);
        System.out.println("Parsed DOB: " + dob);
        // Now dob is proper LocalDate object
        // You can use: dob.plusYears(18), dob.getYear(), etc.
        
        // ------------------------------
        
        // Thread-Safety Demonstration
        System.out.println("\nDateTimeFormatter is THREAD-SAFE");
        System.out.println("Old SimpleDateFormat -> NOT thread-safe ❌");
        System.out.println("New DateTimeFormatter -> THREAD-SAFE ✔");
        // Why? DateTimeFormatter is IMMUTABLE
        
        // ------------------------------
        
        // Interview Question
        // Why is DateTimeFormatter thread-safe?
        // Answer: Because DateTimeFormatter is immutable. 
        // Once created, its state cannot be changed, so multiple threads 
        // can safely use the same instance.
        
        // ------------------------------
        
        // Quick Summary Table
        System.out.println("\nDateTimeFormatter Summary:");
        System.out.println("Date → String    | format()");
        System.out.println("String → Date    | parse()");
        System.out.println("Create formatter | ofPattern()");
        
    }
}
