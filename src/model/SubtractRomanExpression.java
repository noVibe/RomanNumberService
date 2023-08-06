package model;

import service.Roman;

public class SubtractRomanExpression extends RomanExpression{
    public SubtractRomanExpression(String... numbers) {
        super(numbers);
    }

    @Override
    public String execute() {
        return Roman.subtract(numbers);
    }
}
