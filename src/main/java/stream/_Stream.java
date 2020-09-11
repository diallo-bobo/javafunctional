package stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static stream._Stream.Gender.*;

public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );

        people.stream()
                .map(person -> person.name)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        boolean ifAllMathcFemale = people.stream()
                .allMatch(person -> FEMALE.equals(person.gender));

        boolean ifAnyOneMathcFemale = people.stream()
                .anyMatch(person -> FEMALE.equals(person.gender));

        boolean ifNoneMathcPreferNotSay = people.stream()
                .noneMatch(person -> PREFER_NOT_SAY.equals(person.gender));

        System.out.println("ifAllMathcFemale ? " + ifAllMathcFemale);
        System.out.println("ifAnyOneMathcFemale ? " + ifAnyOneMathcFemale);
        System.out.println("ifNoneMathcPreferNotSay ? " + ifNoneMathcPreferNotSay);

    }

    enum Gender {
        MALE, FEMALE, PREFER_NOT_SAY
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
}
