package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.logging.Logger;

public class QuizPrimerNumber {
    private static final Logger LOGGER = Logger.getLogger(QuizPrimerNumber.class.getName());

    // Check if n if a primer nulber
    static IntPredicate isPrimerNumber = n -> {
        if (n < 1) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    };

    // Determins primer number small than n
    static IntFunction<List<Integer>> listPrimerNumberSmallThan = n -> {
        List<Integer> list = new ArrayList<>();
        int x = 1;
        while (x < n) {
            if (isPrimerNumber.test(x)) list.add(x);
            x++;
        }
        return list;
    };

    public static void main(String[] args) {
        LOGGER.info("List primer number small than n");
        System.out.println(listPrimerNumberSmallThan.apply(10));
    }
}
