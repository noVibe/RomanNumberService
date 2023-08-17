package model;

import service.Roman;

public class DivisionRomanExpression extends RomanExpression {
    public DivisionRomanExpression(String... numbers) {
        super(numbers);
    }

    @Override
    public String getResult() {
        if (result == null) {
            result = Roman.divide(numbers);
        }
        return result;
    }
}
