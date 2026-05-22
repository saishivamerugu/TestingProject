package DateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Duration;

public class PeriodVsDuration {
    public static void main(String[] args) {
        
        // 1 What is Period? - Used for DATE-BASED difference
        // Measures in: Years, Months, Days
        // Works with: LocalDate
        
        LocalDate dob = LocalDate.of(2001, 5, 20);
        LocalDate today = LocalDate.now();
        
        Period age = Period.between(dob, today);
        
        System.out.println("Years: " + age.getYears());
        System.out.println("Months: " + age.getMonths());
        System.out.println("Days: " + age.getDays());
        // LocalDate dob = LocalDate.of(2001, 5, 20);
        // Date of Birth.
        // LocalDate today = LocalDate.now();
        // Current date.
        // Period age = Period.between(dob, today);
        // Calculates difference between two dates.
        // Returns a Period object.
        // If today is 2026-02-16:
        // Output: Years: 24, Months: 8, Days: 27 (approx)
        
        // ------------------------------
        
        // Real Use Case - Student Management System
        int studentAge = Period.between(dob, LocalDate.now()).getYears();
        System.out.println("Student Age: " + studentAge + " years");
        // Very common in backend systems
        
        // ------------------------------
        
        // 2 What is Duration? - Used for TIME-BASED difference
        // Measures in: Seconds, Minutes, Hours
        // Works with: LocalTime, LocalDateTime
        
        LocalTime start = LocalTime.of(10, 0);
        LocalTime end = LocalTime.of(15, 30);
        
        Duration duration = Duration.between(start, end);
        
        System.out.println("Hours: " + duration.toHours());
        System.out.println("Minutes: " + duration.toMinutes());
        // LocalTime start = LocalTime.of(10, 0);  // 10:00 AM
        // LocalTime end = LocalTime.of(15, 30);    // 3:30 PM
        // Duration duration = Duration.between(start, end);
        // Calculates time difference.
        // Output: Hours: 5, Minutes: 330
        
        // ------------------------------
        
        // Duration with LocalDateTime example
        LocalDateTime startDT = LocalDateTime.of(2026, 2, 14, 10, 0);
        LocalDateTime endDT = LocalDateTime.of(2026, 2, 14, 15, 30);
        
        Duration durationDT = Duration.between(startDT, endDT);
        System.out.println("Total Hours (DateTime): " + durationDT.toHours());
        
        // ------------------------------
        
        // Important Difference Table
        System.out.println("PERIOD vs DURATION:");
        System.out.println("Period -> Date-based (Years, Months, Days) -> LocalDate");
        System.out.println("Duration -> Time-based (Hours, Minutes, Seconds) -> LocalTime/LocalDateTime");
        
        // ------------------------------
        
        // Interview Traps - These will FAIL
        // Period p = Period.between(start, end);  // ERROR! Period doesn't work with LocalTime
        // Duration d = Duration.between(dob, today);  // ERROR! Duration doesn't work with LocalDate
        
        // ------------------------------
        
        // Real Industry Examples
        System.out.println("\nReal-World Usage:");
        System.out.println("1. Age calculation -> Period");
        System.out.println("2. Subscription validity -> Period");
        System.out.println("3. Video length -> Duration");
        System.out.println("4. Login session time -> Duration");
        
        // ------------------------------
        
        // Interview Question
        // What is difference between Period and Duration?
        // Answer:
        // Period is used to calculate date-based differences (years, months, days) 
        // between two LocalDate objects.
        // Duration is used to calculate time-based differences (seconds, minutes, hours) 
        // between LocalTime or LocalDateTime objects.
        
    }
}
