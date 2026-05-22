package Streams.Terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceOperation {
	public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30);

//        1️ reduce(BinaryOperator<T>)
        Optional<Integer> sum = numbers.stream()
                                       .reduce((a, b) -> a + b);
        System.out.println(sum.get());
        
//       2 reduce(identity, BinaryOperator<T>)
        int sumVal =
        		numbers.stream()
        		    .reduce(0, (a, b) -> a + b);
        System.out.println(sumVal);

//                start = 0
//        		0 + 1 = 1
//        		1 + 2 = 3
//        		3 + 3 = 6
//        		6 + 4 = 10
        
        
    }
}
