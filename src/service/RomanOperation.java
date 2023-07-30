package service;

import enums.ArithmeticOperationForRoman;
import exception.NotEnoughNumbersException;
import exception.UnexpectedRomanResultException;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class RomanOperation {
    public static String sumRomans(String... romanNumber) {
        return calculate(Integer::sum, romanNumber);
    }

    public static String subtractRomans(String... romanNumber) {
        try {
            return calculate(((x, y) -> x - y), romanNumber);
        } catch (IllegalArgumentException e) {
            throw new UnexpectedRomanResultException("Roman subtraction result must be positive");
        }
    }

    public static String multiplyRomans(String... romanNumber) {
        return calculate(((x, y) -> x * y), romanNumber);
    }

    public static String divideRomans(String... romanNumber) {
        try {
            return calculate(((x, y) -> x / y), romanNumber);
        } catch (IllegalArgumentException e) {
            throw new UnexpectedRomanResultException("Roman division result can't be less than zero");
        }
    }

    private static String calculate(BinaryOperator<Integer> operation, String... romanNumber) {
        return RomeArabicConverter.convert(
                Arrays.stream(romanNumber)
                        .map(RomeArabicConverter::convert)
                        .reduce(operation)
                        .orElseThrow(NotEnoughNumbersException::new));
    }
    public static String evaluate(ArithmeticOperationForRoman operation, String... romanNumber) {
        return switch (operation) {
            case SUM -> sumRomans(romanNumber);
            case SUBTRACT -> subtractRomans(romanNumber);
            case DIVIDE -> divideRomans(romanNumber);
            case MULTIPLY -> multiplyRomans(romanNumber);
        };
    }
}
