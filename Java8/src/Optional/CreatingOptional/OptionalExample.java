package Optional.CreatingOptional;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
		 // 1️ Using of()
        Optional<String> name1 = Optional.of("Sai");
        System.out.println("Using of(): " + name1);

        // 2️ Using ofNullable() with null
        String value = null;
        Optional<String> name2 = Optional.ofNullable(value);
        System.out.println("Using ofNullable(): " + name2);

        // 3️ Using empty()
        Optional<String> name3 = Optional.empty();
        System.out.println("Using empty(): " + name3);
        
        
	}
}
