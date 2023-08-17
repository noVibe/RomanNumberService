package model;

import service.Roman;

public class MultiplicationRomanExpression extends RomanExpression{
    public MultiplicationRomanExpression(String... numbers) {
        super(numbers);
    }

    @Override
    public String getResult() {
        if (result == null) {
            result = Roman.multiply(numbers);
        }
        return result;
    }
}
