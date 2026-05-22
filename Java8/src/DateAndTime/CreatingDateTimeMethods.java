package DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CreatingDateTimeMethods {
    public static void main(String[] args) {
        
        // 1 now() → Get Current Date/Time
        // This method returns the current system date/time.
        
        LocalDate today = LocalDate.now();
        System.out.println(today);
        // LocalDate.now()
        // Gets current system date.
        // Returns a LocalDate object.
        // Stores it in variable today.
        // If today is Feb 16, 2026:
        // Output: 2026-02-16
        
        // ------------------------------
        
        // 2 LocalTime.now()
        LocalTime time = LocalTime.now();
        System.out.println(time);
        // Output: 16:20:45.123 (example)
        // Gives current system time.
        
        // ------------------------------
        
        // 3 LocalDateTime.now()
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        // Output: 2026-02-16T16:21:30.456 (example)
        
        // ------------------------------
        
        // 4 of() → Create Custom Date/Time
        // Used when you want to create a specific date or time manually.
        
        LocalDate date = LocalDate.of(2026, 2, 14);
        System.out.println(date);
        // LocalDate.of(2026, 2, 14);
        // Parameters:
        // 2026 = Year
        // 2 = Month (starts from 1, not 0)
        // 14 = Day
        // Output: 2026-02-14
        
        // ------------------------------
        
        LocalTime customTime = LocalTime.of(15, 30, 20);
        System.out.println(customTime);
        // LocalTime.of(15, 30, 20);
        // Parameters:
        // 15 = Hour
        // 30 = Minute
        // 20 = Second
        // Output: 15:30:20
        
        // ------------------------------
        
        LocalDateTime customDT = LocalDateTime.of(2026, 2, 14, 15, 30);
        System.out.println(customDT);
        // LocalDateTime.of(2026, 2, 14, 15, 30);
        // Output: 2026-02-14T15:30
        
        // ------------------------------
        
        // 5 parse() → Convert String to Date
        // Very important in backend projects.
        
        LocalDate parsedDate = LocalDate.parse("2026-02-14");
        System.out.println(parsedDate);
        // LocalDate.parse("2026-02-14");
        // Takes string in ISO format (yyyy-MM-dd)
        // Converts into LocalDate object
        // Output: 2026-02-14
        
        // Important Rule About parse()
        // Default format must be: yyyy-MM-dd
        // If string format is different: 14/02/2026
        // It will throw error
        // Later we'll fix this using DateTimeFormatter.
        
        // ------------------------------
        
        // Real Backend Example (Very Important)
        // In your Student Management System:
        String dobInput = "2001-05-20";
        LocalDate dob = LocalDate.parse(dobInput);
        System.out.println("Student DOB: " + dob);
        // Now dob is a proper date object.
        // You can use:
        // dob.plusDays(10);
        // dob.getYear();
        // dob.getMonth();
        // Output: 2001-05-20
        
        // ------------------------------
        
        // Interview Question
        // What is difference between now() and of()?
        // Answer: now() gives current system date/time,
        // while of() is used to create a specific date or time manually.
        
    }
}
