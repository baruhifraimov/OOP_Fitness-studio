public class Session {
    private SessionType sType;
    private String sDate;
    private ForumType sFType;
    private Instructor sInstructor;

    public Session(SessionType sType, String date, ForumType fType, Instructor instructor) {
        this.sType = sType;
        this.sDate = date;
        this.sFType = fType;
        this.sInstructor = instructor;
    }
}

enum ForumType {
    All,
    Female,
    Male,
    Seniors;
}

enum SessionType {
    Pilates,
    ThaiBoxing,
    MachinePilates,
    Ninja
}

