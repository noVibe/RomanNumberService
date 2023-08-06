package model;

import service.Roman;

public class MultiplicationRomanExpression extends RomanExpression{
    public MultiplicationRomanExpression(String... numbers) {
        super(numbers);
    }

    @Override
    public String execute() {
        return Roman.multiply(numbers);
    }
}
