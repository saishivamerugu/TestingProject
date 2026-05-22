package FunctionalInterface;

public class FunctionalInterfaces {
	public static void main(String[] args) {
		
		Hello h = (String name) -> {
			System.out.println("Name is "+name);
		};
		h.hello("sai");
		h.msg("Welcome to Java");
	}
}
