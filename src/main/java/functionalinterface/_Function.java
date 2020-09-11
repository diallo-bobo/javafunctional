package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    static Function<Integer, Integer> incrementByOneFunction = number -> ++number;
    static Function<Integer, Integer> multipleBy10Function = number -> number * 10;
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction = (x, y) -> (x + 1) * y;

    public static void main(String[] args) {

        // Function takes 1 argument and produces 1 result
        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multipleBy10Function.apply(increment2);
        System.out.println(multiply);

        System.out.println("Unsing andThen() method of Function interface");

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multipleBy10Function);

        System.out.println(addBy1AndThenMultiplyBy10.apply(1));

        // BiFunction takes 2 arguments and produces 1 result
        System.out.println("Unsing BiFunction interface");
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(1, 100));
    }

}
