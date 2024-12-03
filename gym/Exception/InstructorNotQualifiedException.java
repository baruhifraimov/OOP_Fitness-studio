package gym.Exception;

public class InstructorNotQualifiedException extends Exception {
    public InstructorNotQualifiedException() {
        super("Instructor not qualified to teach this session");
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
