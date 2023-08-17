package service;

import java.util.function.BinaryOperator;

enum RomanArithmeticOperation {
    SUM(Integer::sum),
    SUBTRACT((x, y) -> x - y),
    DIVIDE((x, y) -> x / y),
    MULTIPLY((x, y) -> x * y);
    public final BinaryOperator<Integer> binaryOperator;

    RomanArithmeticOperation(BinaryOperator<Integer> binaryOperator) {
        this.binaryOperator = binaryOperator;
    }
}
