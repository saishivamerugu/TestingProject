package FunctionalInterface;

import java.util.function.Predicate;

@FunctionalInterface
interface FunctionalInterfaceEx {
	void add(int a, int b, String c);
}

@FunctionalInterface
interface Square{
	int squareNum(int x);
}



public class FunctionalInterface3{
	public static void main(String[] args) {
		FunctionalInterfaceEx e = (a, b, c) -> {
			System.out.println(a+b+c);
		};
		e.add(1, 2, "three");
		Square s = num -> num * num;
		System.out.println(s.squareNum(4));
		
		Predicate<Integer> t = x -> x > 20;
		System.out.println(t.test(21));
	}
}
