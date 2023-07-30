package model;

import enums.ArithmeticOperationForRoman;
import service.RomanOperation;

public class RomanExpression {
    private String[] numbers;
    private ArithmeticOperationForRoman operation;

    public RomanExpression(ArithmeticOperationForRoman operation, String... numbers) {
        this.numbers = numbers;
        this.operation = operation;
    }

    public String execute() {
        return switch (operation) {
            case SUM -> RomanOperation.sumRomans(numbers);
            case SUBTRACT -> RomanOperation.subtractRomans(numbers);
            case DIVIDE -> RomanOperation.divideRomans(numbers);
            case MULTIPLY -> RomanOperation.multiplyRomans(numbers);
        };
    }

    public String[] getNumbers() {
        return numbers;
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
