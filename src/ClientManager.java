import java.util.HashSet;

public class ClientManager {
    private HashSet<Client> clients;

    public ClientManager() {
        this("clients.csv");
    }

    public ClientManager(String file) {
        clients = new HashSet<>();
        ClientReader kr = new ClientReader(file);
        clients = kr.loadKlanten();
    }
}

