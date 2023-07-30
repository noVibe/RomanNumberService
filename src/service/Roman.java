package service;

import enums.ArithmeticOperationForRoman;
import exception.InvalidRomanNumberException;
import service.support_services.RomanOperation;
import service.support_services.RomeArabicConverter;

public class Roman {
    public static String sum(String... romanNumbers) {
        return RomanOperation.evaluate(ArithmeticOperationForRoman.SUM, romanNumbers);
    }

    public static String subtract(String... romanNumbers) {
        return RomanOperation.evaluate(ArithmeticOperationForRoman.SUBTRACT, romanNumbers);
    }

    public static String multiply(String... romanNumbers) {
        return RomanOperation.evaluate(ArithmeticOperationForRoman.MULTIPLY, romanNumbers);
    }

    public static String divide(String... romanNumbers) {
        return RomanOperation.evaluate(ArithmeticOperationForRoman.DIVIDE, romanNumbers);
    }

    public static int convert(String romanNumber) {
        return RomeArabicConverter.convert(romanNumber);
    }

    public static String convert(int romanNumber) {
        return RomeArabicConverter.convert(romanNumber);
    }

    public static boolean isLegal(String romanNumber) {
        try {
            RomeArabicConverter.convert(romanNumber);
            return true;
        } catch (InvalidRomanNumberException e) {
            return false;
        }
    }
}
