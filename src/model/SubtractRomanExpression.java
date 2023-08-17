package model;

import service.Roman;

public class SubtractRomanExpression extends RomanExpression{
    public SubtractRomanExpression(String... numbers) {
        super(numbers);
    }

    @Override
    public String getResult() {
        if (result == null) {
            result = Roman.subtract(numbers);
        }
        return result;
    }
}
