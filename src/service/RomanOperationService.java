package service;

import exception.NotEnoughNumbersException;
import exception.UnexpectedRomanResultException;

import java.util.Arrays;
import java.util.function.BinaryOperator;

import static service.RomanArithmeticOperation.*;

final class RomanOperationService {
    static String evaluate(RomanArithmeticOperation operation, String... romanNumber) {
        return switch (operation) {
            case SUM -> sumRomans(romanNumber);
            case SUBTRACT -> subtractRomans(romanNumber);
            case DIVIDE -> divideRomans(romanNumber);
            case MULTIPLY -> multiplyRomans(romanNumber);
        };
    }

    private static String sumRomans(String... romanNumber) {
        return calculate(SUM.binaryOperator, romanNumber);
    }

    private static String subtractRomans(String... romanNumber) {
        try {
            return calculate(SUBTRACT.binaryOperator, romanNumber);
        } catch (IllegalArgumentException e) {
            throw new UnexpectedRomanResultException("Roman subtraction result must be positive");
        }
    }

    private static String multiplyRomans(String... romanNumber) {
        return calculate(MULTIPLY.binaryOperator, romanNumber);
    }

    private static String divideRomans(String... romanNumber) {
        try {
            return calculate(DIVIDE.binaryOperator, romanNumber);
        } catch (IllegalArgumentException e) {
            throw new UnexpectedRomanResultException("Roman division result must be positive");
        }
    }

    private static String calculate(BinaryOperator<Integer> operation, String... romanNumber) {
        return RomeArabicConverter.convert(
                Arrays.stream(romanNumber)
                        .map(RomeArabicConverter::convert)
                        .reduce(operation)
                        .orElseThrow(NotEnoughNumbersException::new));
    }
}
