package classExample.exception;

public class DivideByZeroException extends Exception {
    public DivideByZeroException() {
        super("0으로 나눔...");
    }
}
