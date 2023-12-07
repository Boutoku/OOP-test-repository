import java.util.HashSet;

public class ContactManager {
    private HashSet<Contact> clients;

    public ContactManager() {
        this("clients.csv");
    }

    public ContactManager(String file) {
        clients = new HashSet<>();
        ContactReader kr = new ContactReader(file);
        clients = kr.loadClients();
    }
}

