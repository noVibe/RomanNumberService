package model;

import enums.ArithmeticOperationForRoman;

public class MultiplicationRomanExpression extends RomanExpression{
    public MultiplicationRomanExpression(String... numbers) {
        super(ArithmeticOperationForRoman.MULTIPLY, numbers);
    }
}
