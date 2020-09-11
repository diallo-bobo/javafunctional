package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    static Predicate<String> isPhoneNumberValidPredicate = (phone) -> phone.startsWith("77") && phone.length() == 9;
    static Predicate<String> containsNumber6 = (phone) -> phone.contains("6");

    public static void main(String[] args) {
        String phone = "771709810";
        String phone2 = "767707660";

        System.out.println("Without Predicate");
        System.out.println("Number phone " + phone + " is " + (isPhoneNumberValid(phone) ? "valid" : "invalid"));
        System.out.println("Number phone " + phone2 + " is " + (isPhoneNumberValid(phone2) ? "valid" : "invalid"));

        System.out.println("With Predicate");
        System.out.println("Number phone " + phone + " is " + (isPhoneNumberValidPredicate.test(phone) ? "valid" : "invalid"));
        System.out.println("Number phone " + phone2 + " is " + (isPhoneNumberValidPredicate.test(phone2) ? "valid" : "invalid"));
        
        System.out.println(phone + " Is phone valid and contains number 6 ? " +
                isPhoneNumberValidPredicate.and(containsNumber6).test(phone));

        System.out.println(phone2 + " Is phone valid and contains number 6 ? " +
                isPhoneNumberValidPredicate.or(containsNumber6).test(phone2));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("77") && phoneNumber.length() == 9;
    }
}
