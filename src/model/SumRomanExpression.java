package model;

import enums.ArithmeticOperationForRoman;

public class SumRomanExpression extends RomanExpression{
    public SumRomanExpression(String... numbers) {
        super(ArithmeticOperationForRoman.SUM, numbers);
    }
}
