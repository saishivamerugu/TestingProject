package Optional.GettiingValues;

import java.util.Optional;

public class GettingValuesSafelyfromOptional {

	public static void main(String[] args) {
		// 1. get() :- It simply returns the value inside Optional.
		
		Optional<String> name = Optional.of("Sai");
		String result = name.get();
		System.out.println(result);
		// Output : Sai - works fine
		
		Optional<String> name1 = Optional.empty();

		//String result1 = name1.get();   // NoSuchElementException
	//	System.out.println(result1);
		// 2. orElse() ⭐
//			This is safe.
//			What it does?
//			If value exists → return it
//			If empty → return default value
		
		Optional<String> name2 = Optional.of("Sai");

		String result2 = name2.orElse("Default Name");
		System.out.println(result2);
		
		Optional<String> name3 = Optional.empty();

		String result3 = name.orElse("Default Name");
//		System.out.println(result3);
//		Output:  Default Name
//		No crash 
		
		
		
		// 3. orElseGet() (Very Important Interview Question)
//		 What it does?
//				Similar to orElse(),
//				but it takes a Supplier (lambda).
//				Syntax: orElseGet(() -> value)
		
		Optional<String> name4 = Optional.empty();

		String result4 = name.orElseGet(() -> "Generated Default");
		System.out.println(result4);
		
//		Difference between orElse() and orElseGet()?
//
//				This is VERY common.
//				Important Difference
//				orElse()
//				name.orElse(getDefaultValue());
//				The method getDefaultValue() is executed ALWAYS
//				even if value exists.
//				orElseGet()
//				name.orElseGet(() -> getDefaultValue());
//			    The method is executed ONLY if value is absent.

		
	}
}
