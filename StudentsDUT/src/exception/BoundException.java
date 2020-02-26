package exception;

public class BoundException extends Exception {

    private String message;

    public BoundException(String message) {
        super();
        this.message = message;
    }

    public BoundException() {
        super();

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
