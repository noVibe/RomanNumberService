package exception;

public class NotEnoughNumbersException extends RuntimeException{
    public NotEnoughNumbersException() {
        super("Must be at least one number");
    }
}
