package DateAndTime;

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZoneHandling {
    public static void main(String[] args) {
        
        // 1 Get Current Time in Specific Timezone
        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        
        System.out.println("India Time: " + indiaTime);
        // ZoneId.of("Asia/Kolkata");
        // Creates timezone object for India (UTC+05:30)
        // ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        // Gets current date + time + timezone
        // Output example: 2026-02-16T20:21:20.123+05:30[Asia/Kolkata]
        // Breakdown:
        // 2026-02-16 = Date
        // 20:21:20 = Time  
        // +05:30 = UTC Offset
        // [Asia/Kolkata] = Zone Name
        
        // ------------------------------
        
        // 2 Convert Time Between Timezones (Global Apps)
        ZonedDateTime indiaMeeting = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime usMeeting = indiaMeeting.withZoneSameInstant(ZoneId.of("America/New_York"));
        
        System.out.println("India Meeting Time: " + indiaMeeting);
        System.out.println("US Meeting Time: " + usMeeting);
        // withZoneSameInstant()
        // Converts to another timezone
        // Keeps SAME moment in time
        // Only changes display according to zone
        // Example:
        // India: 2026-02-16T15:30+05:30
        // USA: 2026-02-16T05:00-05:00 (same instant)
        
        // ------------------------------
        
        // Common Timezone Examples
        System.out.println("\nCommon Timezones:");
        System.out.println("India: Asia/Kolkata");
        System.out.println("USA: America/New_York");
        System.out.println("UK: Europe/London");
        System.out.println("Japan: Asia/Tokyo");
        
        // ------------------------------
        
        // 3 List All Available Timezones (Hundreds exist)
        // ZoneId.getAvailableZoneIds().forEach(System.out::println);
        // Uncomment above line to see all valid timezone IDs
        
        // ------------------------------
        
        // Real Industry Example - Best Practice
        System.out.println("\nBest Practice for Global Apps:");
        System.out.println("1. Store time in UTC in database");
        System.out.println("2. Convert to user timezone while displaying");
        
        // Example: Server UTC time
        ZonedDateTime utcTime = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("Database Storage (UTC): " + utcTime);
        
        // ------------------------------
        
        // Key Classes Summary
        System.out.println("\nTimeZone Classes:");
        System.out.println("ZoneId -> Represents timezone (Asia/Kolkata)");
        System.out.println("ZonedDateTime -> Date + Time + Zone");
        
        // ------------------------------
        
        // Interview Question
        System.out.println("\nINTERVIEW QUESTION:");
        System.out.println("Why store time in UTC?");
        System.out.println("Answer: UTC is timezone-neutral. Avoids ambiguity");
        System.out.println("and daylight saving issues. Convert to user's");
        System.out.println("local timezone only while displaying.");
        
        // ------------------------------
        
        // Common Mistake
        System.out.println("\nAVOID for Global Apps:");
        System.out.println("LocalDateTime ❌ (No timezone info)");
        System.out.println("USE:");
        System.out.println("ZonedDateTime ✔");
        System.out.println("OffsetDateTime ✔");
        
        // ------------------------------
        
        // Quick Summary
        System.out.println("\nTimeZone Summary:");
        System.out.println("Timezone       | ZoneId");
        System.out.println("Date+Time+Zone | ZonedDateTime");
        System.out.println("Convert zone   | withZoneSameInstant()");
        System.out.println("Best practice  | Store in UTC");
        
    }
}
