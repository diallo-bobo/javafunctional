package quiz;

import java.util.function.IntUnaryOperator;

public class QuzLastDigit {
    // Determine the last digit of the 2^n number, where n is a given integer.
    static IntUnaryOperator lastDigitFunctional = n -> {
        Double result = Math.pow(2, n);
        String chaine = result.toString();
        int index = chaine.contains("E") ? chaine.indexOf("E") : chaine.indexOf(".");

        return Integer.parseInt(chaine.substring(index - 1, index));
    };
    // Determine the last digit of the 2^n number, where n is a given integer.
    static IntUnaryOperator lastDigitEfficientFunctional = n -> {
        if (n == 0) return 1;

        int result = n % 4;
        switch (result) {
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            default:
                return 6;
        }
    };

    public static void main(String[] args) {

        // Test Last digit of 2^n
        System.out.println("Test Last digit of 2^n With no efficient function");
        System.out.println(lastDigitFunctional.applyAsInt(26));
        System.out.println(lastDigitFunctional.applyAsInt(51));
        System.out.println(lastDigitFunctional.applyAsInt(41));
        System.out.println(lastDigitFunctional.applyAsInt(16));

        System.out.println("Test Last digit of 2^n With no efficient function");
        System.out.println(lastDigitEfficientFunctional.applyAsInt(26));
        System.out.println(lastDigitEfficientFunctional.applyAsInt(51));
        System.out.println(lastDigitEfficientFunctional.applyAsInt(41));
        System.out.println(lastDigitEfficientFunctional.applyAsInt(16));

    }
}
