package finalsection;

import java.util.Comparator;
import java.util.function.Consumer;

public class Main {
    static Comparator<String> stringComparator = Comparator.comparingInt(String::length);

    public static void main(String[] args) {
        hello("Aicha",
                "Diallo",
                value -> System.out.println("No lastName provide for " + value)
        );

        hello2(null,
                () -> System.out.println("No lastName provide")
        );

        System.out.println("=== Comparator");
        System.out.println(stringComparator.compare("bobos", "bibiss"));
    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        if (lastName != null) {
            System.out.println("LastName: " + lastName);
        } else {
            callback.accept(firstName);
        }
    }

    static void hello2(String lastName, Runnable callback) {
        if (lastName != null) {
            System.out.println("LastName: " + lastName);
        } else {
            callback.run();
        }
    }
}
