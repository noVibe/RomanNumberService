package model;

import enums.ArithmeticOperationForRoman;
import service.support_services.RomanOperation;

public class RomanExpression {
    private String[] numbers;
    private ArithmeticOperationForRoman operation;

    public RomanExpression(ArithmeticOperationForRoman operation, String... numbers) {
        this.numbers = numbers;
        this.operation = operation;
    }

    public String execute() {
        return RomanOperation.evaluate(operation, numbers);
    }

    public String[] getNumbers() {
        String[] arr = new String[numbers.length];
        System.arraycopy(numbers, 0, arr, 0, numbers.length);
        return arr;
    }

    public void setNumbers(String[] numbers) {
        this.numbers = numbers;
    }

    public ArithmeticOperationForRoman getOperation() {
        return operation;
    }

    public void setOperation(ArithmeticOperationForRoman operation) {
        this.operation = operation;
    }
}
