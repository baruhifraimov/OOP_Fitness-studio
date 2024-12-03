package gym.Exception;

public class DuplicateClientException extends Exception{
    public DuplicateClientException() {
        super("Client already registered");
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
