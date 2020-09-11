package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhone) ->
            System.out.println(String.format(
                    "Hello %s, thanks for registering phone number " + (showPhone ? "%s" : "*******"),
                    customer.customerName, customer.customerPhone));

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number " +
                    customer.customerPhone);

    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "999999");
        Customer abdou = new Customer("Abdou", "8888888888");

        // Normal function
        greetCustomer(maria);

        // Consumer Functional Interface
        greetCustomerConsumer.accept(maria);
        greetCustomerConsumerV2.accept(abdou, false);
    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number " +
                customer.customerPhone);
    }

    static class Customer {
        String customerName;
        String customerPhone;

        public Customer(String customerName, String customerPhone) {
            this.customerName = customerName;
            this.customerPhone = customerPhone;
        }
    }
}
