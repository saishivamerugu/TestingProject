package FunctionalInterface2;

@FunctionalInterface
public interface Interface1 {

	public void sayHi();
	
	default void sayHello() {
		System.out.println("Hello my name is sai");
	}
}
