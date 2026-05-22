package FunctionalInterface;

public class AddingNumbers {
	public static void main(String[] args) {
		
		Adder sum = (int a, int b) -> a+b;
		int val = sum.add(10, 50);
		System.out.println(val);
		System.out.println(sum.add(10, 50));
		
		Multiply multiply = (int a, int b) -> {
			int m = a * b;
			System.out.println(m);
		};
		multiply.multiply(10, 50); 
	}

}
