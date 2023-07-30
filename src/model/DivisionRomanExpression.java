package model;

import enums.ArithmeticOperationForRoman;

public class DivisionRomanExpression extends RomanExpression{
    public DivisionRomanExpression(String... numbers) {
        super(ArithmeticOperationForRoman.DIVIDE, numbers);
    }
}
