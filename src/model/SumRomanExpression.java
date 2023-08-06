package model;

import service.Roman;

public class SumRomanExpression extends RomanExpression{
    public SumRomanExpression(String... numbers) {
        super(numbers);
    }

    @Override
    public String execute() {
        return Roman.sum(numbers);
    }
}
