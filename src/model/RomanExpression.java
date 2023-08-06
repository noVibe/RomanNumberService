package model;

public abstract class RomanExpression {
    protected String[] numbers;

    public RomanExpression(String... numbers) {
        this.numbers = numbers;
    }

    public abstract String execute();


    public String[] getNumbers() {
        String[] arr = new String[numbers.length];
        System.arraycopy(numbers, 0, arr, 0, numbers.length);
        return arr;
    }

    public void setNumbers(String[] numbers) {
        this.numbers = numbers;
    }
}
