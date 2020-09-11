package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println("Without Supplier");
        System.out.println("Database url: " + getDBConnectionUrl());

        System.out.println("With Supplier");
        System.out.println("Database url: " + getDBConnectionUrlSupplier.get());
    }

    static Supplier<List<String>> getDBConnectionUrlSupplier = () -> List.of(
            "jdbc://localhost:5432/users",
            "jdbc://localhost:5432/customers");

    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }
}
