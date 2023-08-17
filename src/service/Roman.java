package service;

import exception.InvalidRomanNumberException;

import static service.RomanArithmeticOperation.*;

public final class Roman {
    public static String sum(String... romanNumbers) {
        return RomanOperationService.evaluate(SUM, romanNumbers);
    }

    public static String subtract(String... romanNumbers) {
        return RomanOperationService.evaluate(SUBTRACT, romanNumbers);
    }

    public static String multiply(String... romanNumbers) {
        return RomanOperationService.evaluate(MULTIPLY, romanNumbers);
    }

    public static String divide(String... romanNumbers) {
        return RomanOperationService.evaluate(DIVIDE, romanNumbers);
    }

    public static int convert(String romanNumber) {
        return RomeArabicConverter.convert(romanNumber);
    }

    public static String convert(int romanNumber) {
        return RomeArabicConverter.convert(romanNumber);
    }

    public static boolean isValid(String romanNumber) {
        try {
            RomeArabicConverter.convert(romanNumber);
            return true;
        } catch (InvalidRomanNumberException e) {
            return false;
        }
    }
}
