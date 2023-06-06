package service;

import enums.ArithmeticOperation;
import enums.NumberFormat;
import exception.InvalidInputException;
import model.Expression;

import static enums.ArithmeticOperation.*;

public class ExpressionFabric {
    private static ArithmeticOperation getOperation(String symbol) {
        return switch (symbol) {
            case "+" -> PLUS;
            case "-" -> MINUS;
            case "*" -> MULTIPLY;
            case "/" -> DIVIDE;
            default -> throw new InvalidInputException();
        };
    }

    public static Expression getExpression(String line) {
        NumberFormat format = getNumberFormatAndValidate(line);
        String[] bits = line.trim().split("\\s");
        ArithmeticOperation operation = getOperation(bits[1]);
        int firstNumber = getNumber(bits[0], format);
        int secondNumber = getNumber(bits[2], format);
        return new Expression(firstNumber, secondNumber, operation, format);
    }

    private static int getNumber(String s, NumberFormat format) {
        return switch (format) {
            case ARABIC -> Integer.parseInt(s);
            case ROMAN -> RomeArabicConverter.convert(s);
        };
    }

    private static NumberFormat getNumberFormatAndValidate(String input) {
        if (input.matches("^\\d+\\s[+\\-/*]\\s\\d+$")) {
            return NumberFormat.ARABIC;
        }
        if (input.matches("^[A-Z]+\\s[+\\-/*]\\s[A-Z]+$"))
            return NumberFormat.ROMAN;
        else throw new InvalidInputException();
    }
}

// ^(((X?C?)|(X?LX{0,3}))?((I?[VX])|(V?I{1,3}))?)$ - check roman from 0 to 110