package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;
import static combinatorpattern.CustomerRegistrationValidator.ValidatorResult.*;

public class Main {
    public boolean verifyPhone(String phone) {
        return phone.matches("^77[0-9]{3}([0-9]{2}){2}");
    }
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Aicha",
                "aicha@gmail.com",
                "+221771709810",
                LocalDate.of(2019, 11, 23)
        );

        System.out.println(new CustomerValidatorService().isValid(customer));

        // Using Combinator pattern
        ValidatorResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(result);

        if (result != SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
