package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println("============");

        Optional.ofNullable("bobo.diallo@m2t.biz")
                .ifPresentOrElse(
                        email -> System.out.println("Send email to " + email),
                        () -> System.out.println("Cannot send email")
                );
    }
}
