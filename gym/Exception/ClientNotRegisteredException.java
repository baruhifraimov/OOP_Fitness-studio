package gym.Exception;

public class ClientNotRegisteredException extends Exception {
    public ClientNotRegisteredException() {
        super("Client not registered");
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
