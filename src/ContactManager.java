import java.util.HashSet;

public class ContactManager {
    private HashSet<Contact> contacts;

    public ContactManager() {
        this("contacts.csv");
    }

    public ContactManager(String file) {
        contacts = new HashSet<>();
        ContactReader kr = new ContactReader(file);
        contacts = kr.loadContacts();
    }
    public Contact getContact(String name) throws Exception {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        throw new Exception("no contact with name " + name);
    }

    public void printContacts(){
        contacts.forEach(contact -> System.out.println(contact));
    }
}

