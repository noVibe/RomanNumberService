package model;

import service.Roman;

public class DivisionRomanExpression extends RomanExpression{
    public DivisionRomanExpression(String... numbers) {
        super(numbers);
    }

    @Override
    public String execute() {
        return Roman.divide(numbers);
    }
}
