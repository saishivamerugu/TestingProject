package Streams;

import java.util.Arrays;
import java.util.List;

public class LimitExample {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        numbers.stream()
               .limit(3)
               .forEach(System.out::println);
        
//        Stream → filter → map → limit → terminal
//        limit() counts elements passing through.
//        Once count reaches n → it stops further processing.
//        It does not process entire stream.
	}
}
