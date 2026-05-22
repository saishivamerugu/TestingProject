package FunctionalInterface;

@FunctionalInterface
public interface Hello {

    void hello(String name);

    default void msg(String message) {
        System.out.println("Hello its a message");
    }
}

