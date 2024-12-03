import gym.Exception.ClientNotRegisteredException;
import gym.Exception.DuplicateClientException;
import gym.Exception.InstructorNotQualifiedException;
import gym.Exception.InvalidAgeException;

import java.util.ArrayList;

public class Secretary extends Person{
    private int salary;
    private Session session;
    private Gym gym;

    public Secretary(Person person, int salary) {
        super(person);
        this.salary = salary;
        this.gym = Gym.getInstance();
    }

    /**
     *
     * @param pClient the current person we want to register as a client
     * @return returns an instance of Client
     * @throws InvalidAgeException throws if the client is below age limit
     * @throws DuplicateClientException throws if there is existing instance of this client
     */
    public Client registerClient(Person pClient) throws InvalidAgeException, DuplicateClientException {
        //create a temporary instance of Client
        Client newClient = new Client(pClient);
        //Checks if the person is above the age limit
        if(newClient.getAge() < 18){
            throw new InvalidAgeException();
        }
        // Check if the gym contains this client
        if(gym.clientExists(newClient)){
            throw new DuplicateClientException();
        }
        // if client does not appear in the list, add
        else{
            gym.addClient(newClient);
        }
        // return the client instance
        return newClient;
    }

    /**
     *
     * @param client a client instance to remove from the client list
     * @throws ClientNotRegisteredException will throw an exception to - no such client exists to remove
     */
    public void unregisterClient(Client client) throws ClientNotRegisteredException {
        // Is the client registered? return a boolean
        if(!gym.clientExists(client)){
            throw new ClientNotRegisteredException();
        }
        // Go to secretary registered gym and remove the client from the list
        else{
            gym.removeClient(client);
        }
    }

    public Session addSession(SessionType sType, String date, ForumType fType, Instructor instructor) throws InstructorNotQualifiedException {
        return new Session(sType, date, fType, instructor);
    }

    public void registerClientToLesson(Client client, Session session) throws DuplicateClientException,ClientNotRegisteredException {
    }



    public void paySalaries() {
    }

    public void printActions() {
    }

    public Instructor hireInstructor(Person person, int salary, ArrayList<Object> objects) {
        return null;
    }

    public void notify(Session session, String str) {
    }

    public void notify(String str1, String str2) {
    }

    public void notify(String str) {
    }
}
