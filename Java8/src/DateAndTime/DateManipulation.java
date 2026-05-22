package DateAndTime;

import java.time.LocalDate;

public class DateManipulation {
    public static void main(String[] args) {
        
        // 1 plusDays() - Add days to date
        LocalDate date = LocalDate.of(2026, 2, 14);
        LocalDate newDate = date.plusDays(10);
        
        System.out.println("Original Date: " + date);
        System.out.println("After Adding 10 Days: " + newDate);
        // LocalDate date = LocalDate.of(2026, 2, 14);
        // Creates: 2026-02-14
        // LocalDate newDate = date.plusDays(10);
        // Adds 10 days
        // Returns NEW LocalDate object
        // Original date remains unchanged
        // Output:
        // Original Date: 2026-02-14
        // After Adding 10 Days: 2026-02-24
        
        // ------------------------------
        
        // 2 minusDays() - Subtract days from date
        LocalDate date2 = LocalDate.of(2026, 2, 14);
        LocalDate newDate2 = date2.minusDays(5);
        
        System.out.println("After Subtracting 5 Days: " + newDate2);
        // Output: 2026-02-09
        
        // ------------------------------
        
        // 3 plusMonths() - Add months to date
        LocalDate date3 = LocalDate.of(2026, 2, 14);
        LocalDate newDate3 = date3.plusMonths(2);
        
        System.out.println("After Adding 2 Months: " + newDate3);
        // Month automatically adjusted
        // No manual calculation needed
        // Output: 2026-04-14
        
        // ------------------------------
        
        // 4 minusYears() - Subtract years from date
        LocalDate date4 = LocalDate.of(2026, 2, 14);
        LocalDate newDate4 = date4.minusYears(1);
        
        System.out.println("After Subtracting 1 Year: " + newDate4);
        // Output: 2025-02-14
        
        // ------------------------------
        
        // 5 withYear() - Modify specific field (change year only)
        LocalDate date5 = LocalDate.of(2026, 2, 14);
        LocalDate newDate5 = date5.withYear(2030);
        
        System.out.println("Changed Year to 2030: " + newDate5);
        // Output: 2030-02-14
        
        // ------------------------------
        
        // 6 withMonth() - Modify specific field (change month only)
        LocalDate date6 = LocalDate.of(2026, 2, 14);
        LocalDate newDate6 = date6.withMonth(12);
        
        System.out.println("Changed Month to December: " + newDate6);
        // Output: 2026-12-14
        
        // ------------------------------
        
        // Very Important Concept: IMMUTABILITY
        LocalDate date7 = LocalDate.of(2026, 2, 14);
        
        date7.plusDays(5);  // WRONG - doesn't store result
        
        System.out.println("After WRONG usage: " + date7);
        // Output: 2026-02-14 (unchanged!)
        // WHY? plusDays() does NOT modify original object
        // It returns a NEW object but you didn't store it
        
        // CORRECT way:
        date7 = date7.plusDays(5);
        System.out.println("After CORRECT usage: " + date7);
        // Output: 2026-02-19
        
        // ------------------------------
        
        // Real-World Scenario (Student Management System)
        // Student admission date: 2026-02-14
        // Course duration: 6 months
        LocalDate admissionDate = LocalDate.of(2026, 2, 14);
        LocalDate courseEndDate = admissionDate.plusMonths(6);
        
        System.out.println("Admission Date: " + admissionDate);
        System.out.println("Course End Date: " + courseEndDate);
        // Now courseEndDate: 2026-08-14
        // Clean. Simple. No calendar headache.
        
        // ------------------------------
        
        // Interview Question
        // What happens when you call plusDays()?
        // Answer: plusDays() returns a new LocalDate object 
        // with updated value because java.time classes are IMMUTABLE.
        
    }
}
