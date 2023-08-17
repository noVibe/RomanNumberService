package model;

import service.Roman;

public class SumRomanExpression extends RomanExpression{
    public SumRomanExpression(String... numbers) {
        super(numbers);
    }

    @Override
    public String getResult() {
        if (result == null) {
            result = Roman.sum(numbers);
        }
        return result;
    }
}
