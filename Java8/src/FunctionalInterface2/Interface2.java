package FunctionalInterface2;

public interface Interface2 {

	public void sayBye();
	
	public void sayHi();
	
	default void defaultMethod() {
		System.out.println("This is the default method from method 1");
	}
}
