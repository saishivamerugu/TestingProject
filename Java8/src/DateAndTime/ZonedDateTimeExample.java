package DateAndTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {
	 public static void main(String[] args) {
	        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
	        System.out.println(zdt);

	    }
}
