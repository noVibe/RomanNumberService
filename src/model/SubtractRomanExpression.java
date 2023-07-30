package model;

import enums.ArithmeticOperationForRoman;

public class SubtractRomanExpression extends RomanExpression{
    public SubtractRomanExpression(String... numbers) {
        super(ArithmeticOperationForRoman.SUBTRACT, numbers);
    }
}
