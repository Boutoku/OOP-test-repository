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
    public int getNumberOfContacts(){
        int numberOfContacts = 0;
        for (int i =0;i<contacts.size();i++){
            numberOfContacts++;
        }
        return numberOfContacts;
    }

    public int getNumberOfContacts(String title){
        int numberOfContacts = 0;
        for (Contact contact:contacts) {
            if (contact.getTitle().equals(title))
            numberOfContacts++;
        }
        return numberOfContacts;
    }
}

