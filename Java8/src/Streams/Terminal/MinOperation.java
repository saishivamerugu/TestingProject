package Streams.Terminal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinOperation {
	public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 5, 20, 3, 15);
        Optional<Integer> min = numbers.stream()
                                       .min(Integer::compareTo);
        System.out.println(min.get());
        
        Optional<Integer> minVal = numbers.stream()
                .min(Comparator.naturalOrder());
        System.out.println(minVal.get());
        
        
    }
}
