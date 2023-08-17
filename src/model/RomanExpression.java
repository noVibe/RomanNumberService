package model;

import java.util.Arrays;

public abstract class RomanExpression {
    protected String[] numbers;
    protected String result;

    public RomanExpression(String... numbers) {
        this.numbers = numbers;
    }

    public abstract String getResult();


    public String[] getNumbers() {
        return Arrays.copyOf(numbers, numbers.length);
    }
}
