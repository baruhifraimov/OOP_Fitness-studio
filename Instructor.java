import java.lang.reflect.Array;
import java.util.ArrayList;

public class Instructor extends Person {
    private int pph;//payment per hour
    ArrayList<SessionType> sessionTypes;

    public Instructor(Person person,int pph, ArrayList<SessionType> sessionTypes){
        super(person);
        this.pph = pph;
        this.sessionTypes = sessionTypes;
    }


}