import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client extends Person{
    private String name;
    private int balance;
    private String birthDate;

    public Client(Person person) {
        super(person);
    }

    public String getNotifications() {
        return null;
    }

    public String getName() {
        return this.name;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return balance == client.balance && Objects.equals(name, client.name) && Objects.equals(birthDate, client.birthDate);
    }

}