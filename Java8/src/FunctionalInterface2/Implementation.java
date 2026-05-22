package FunctionalInterface2;

public class Implementation implements Interface2 {

	@Override
	public void sayBye() {
		System.out.println("it's from bye");
	}

	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		Implementation impl = new Implementation();
		impl.sayBye();
	}
}
