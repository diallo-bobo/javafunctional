package finalsection;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        hello("Aicha",
                "Diallo",
                value -> System.out.println("No lastName provide for " + value)
        );

        hello2("Bobo",
                null,
                () -> System.out.println("No lastName provide")
        );
    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        if (lastName != null) {
            System.out.println("LastName: " + lastName);
        } else {
            callback.accept(firstName);
        }
    }

    static void hello2(String firstName, String lastName, Runnable callback) {
        if (lastName != null) {
            System.out.println("LastName: " + lastName);
        } else {
            callback.run();
        }
    }
}
