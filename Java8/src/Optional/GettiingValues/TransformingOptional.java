package Optional.GettiingValues;

import java.util.Optional;

public class TransformingOptional {

	public static void main(String[] args) {
		
		// 1. Map
		Optional<String> name = Optional.of("sai");
		Optional<String> upperName = name.map(value -> value.toUpperCase());
		System.out.println(upperName);
		
		// If Optional is Empty
		Optional<String> names = Optional.empty();
		Optional<String> result = names.map(value -> value.toUpperCase());
		System.out.println(result);
		// Output: Optional.empty
		// No crash. No execution of lambda.
		
		// 2. Filter 
		Optional<String> name1 = Optional.of("Sai");
		Optional<String> result1 = name1.filter(value -> value.length() > 5);
		System.out.println(result1);
//				"Sai" length = 3
//				Condition: length > 5 is false
//				So Optional becomes empty
//				Output:  Optional.empty
		
		Optional<String> name2 = Optional.of("Sairam");
		Optional<String> result2 = name2.filter(value -> value.length() > 5);
		System.out.println(result2);
	}
}
