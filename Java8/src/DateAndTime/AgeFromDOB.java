package DateAndTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeFromDOB {
    public static void main(String[] args) {
        
        // 1 User Input - DOB as String
        String dobInput = "20/05/2001";
        
        // 2 Create Formatter for input format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // 3 Convert String → LocalDate
        LocalDate dob = LocalDate.parse(dobInput, formatter);
        
        // 4 Get Today's Date
        LocalDate today = LocalDate.now();
        
        // 5 Calculate Age using Period
        Period age = Period.between(dob, today);
        
        // 6 Display Complete Age
        System.out.println("Age Calculation:");
        System.out.println("DOB Input: " + dobInput);
        System.out.println("Parsed DOB: " + dob);
        System.out.println("Today: " + today);
        System.out.println("Years: " + age.getYears());
        System.out.println("Months: " + age.getMonths());
        System.out.println("Days: " + age.getDays());
        System.out.println("Age is: " + age.getYears() + " years");
        // Step-by-Step:
        // 1. String dobInput = "20/05/2001";  // User input
        // 2. DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //    Because input format is dd/MM/yyyy
        // 3. LocalDate dob = LocalDate.parse(dobInput, formatter);
        //    Now dob = 2001-05-20 (ISO format)
        // 4. LocalDate today = LocalDate.now();  // 2026-02-16
        // 5. Period age = Period.between(dob, today);
        //    Calculates exact difference
        // 6. age.getYears() → Returns 24
        
        // ------------------------------
        
        // WRONG Way (Many Freshers Make This Mistake)
        int wrongAge = LocalDate.now().getYear() - dob.getYear();
        System.out.println("\nWRONG Method: " + wrongAge);
        // Problem: If birthday not yet occurred this year → Wrong age
        // Example: DOB May 20, Today Feb 16 → Should be 24, not 25
        
        // ------------------------------
        
        // CORRECT Way - One Line (Production Ready)
        int correctAge = Period.between(dob, LocalDate.now()).getYears();
        System.out.println("CORRECT One-Liner: " + correctAge + " years");
        
        // ------------------------------
        
        // Real Industry Usage Examples
        System.out.println("\nReal-World Usage:");
        System.out.println("1. Student Registration Systems");
        System.out.println("2. Banking KYC");
        System.out.println("3. Insurance Systems");
        System.out.println("4. Employee Onboarding");
        
        // ------------------------------
        
        // Edge Case - Future Date Validation
        LocalDate futureDOB = LocalDate.of(2030, 1, 1);
        if (futureDOB.isAfter(LocalDate.now())) {
            System.out.println("ERROR: DOB cannot be future date");
        }
        
        // ------------------------------
        
        // Interview Answer
        System.out.println("\nINTERVIEW ANSWER:");
        System.out.println("How do you calculate age from DOB in Java 8?");
        System.out.println("We use LocalDate to store DOB and Period.between(dob, LocalDate.now())");
        System.out.println("to calculate difference. Then getYears() gives exact age.");
        System.out.println("This handles month/day differences correctly.");
        
        // ------------------------------
        
        // Quick Summary Table
        System.out.println("\nAge Calculation Steps:");
        System.out.println("String → Date     | parse()");
        System.out.println("Current date      | now()");
        System.out.println("Difference        | Period.between()");
        System.out.println("Get age           | getYears()");
        
    }
}
