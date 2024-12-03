import java.util.ArrayList;
import java.util.List;

// Gym will be our SINGLETON
public class Gym {
    private static Gym instance = new Gym();
    private String name;
    private Secretary secretary;
    private List<Client> clientList;

    private Gym() {
        clientList = new ArrayList<>();
    }

    // Register client list
    public void addClient(Client client) {
        clientList.add(client);
    }
    // Checks if the client is registered
    public boolean clientExists(Client client) {
        return clientList.contains(client);
    }

    //removes the client from list person
    public void removeClient(Client client) {
        clientList.remove(client);
    }

    public static Gym getInstance() {
        return instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecretary(Person person, int salary) {
        this.secretary = new Secretary(person, salary);
    }

    public Secretary getSecretary() {
        return this.secretary;
    }

    public String getName(){
        return this.name;
    }
}
