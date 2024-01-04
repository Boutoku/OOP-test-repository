import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

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
    public void printContactsPerTitle(){
        HashMap<String, Integer> titleCount = new HashMap<>();
        contacts.stream()
                .map(Contact::getTitle)
                .filter(title -> title != null)
                .forEach(title -> titleCount.merge(title,1, Integer::sum));

        titleCount.forEach((title, count) -> System.out.println(title + "->" + count));
    }
}

