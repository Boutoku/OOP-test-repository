import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;

/**
 * Een klasse om klanteninformatie te lezen uit een csv bestand
 * DE klantenfile bevat naaminfromatie, adresinformatie en contactinformatie
 * van 88 klanten verspreid over de wereld.
 * <p>
 * Het bestand bevat volgende informatie
 * CustomerID CompanyName ContactName ContactTitle Address City Region PostalCode Country Phone Fax
 * Informatie van 1 klant bevindt zich op 1 lijn en wordt gescheiden door ;
 *
 * @author Marc De Caluwé
 * @version 2019-12-01
 */
public class ContactReader {
    private String format;
    private ArrayList<ContactEntry> entries;

    public ContactReader() {
        this("contacts.csv");
    }

    public ContactReader(String filename) {
        // The format for the data.
        format = "CustomerID;Namelient;NameContact;TitleContact;Addresd;City;Region;ZIP;Country;Phone;Fax";
        // Where to store the data.
        entries = new ArrayList<>();

        // Attempt to read the complete set of data from file.
        try {
            File pFile = new File("");
            File klantFile = new File(pFile.getAbsolutePath() + "/data/" + filename);
            Scanner klantfile = new Scanner(klantFile);
            // Lees het klantenbestand tot de laatste lijn
            while (klantfile.hasNextLine()) {
                String klantlijn = klantfile.nextLine();
                // Splits de klant en maak er een nieuw Klant-object van
                ContactEntry entry = new ContactEntry(klantlijn);
                entries.add(entry);
            }
            klantfile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Er dook een probleem op: " + e.getMessage());
        }
    }

    public ArrayList<ContactEntry> getEntries() {
        return entries;
    }

    /**
     * Print de data.
     */
    public void printData() {
        for (ContactEntry entry : entries) {
            System.out.println(entry);
        }
    }

    public HashSet<Contact> loadContacts() {
        HashSet<Contact> klanten = new HashSet<>();
        for(ContactEntry ke : getEntries()) {
            String[] data = ke.getData();
            Contact k = new Contact(data[ContactEntry.ID]);
            k.setName(data[ContactEntry.NAMECONTACT]);
            k.setTitle(data[ContactEntry.TITLECONTACT]);
            k.setCity(data[ContactEntry.CITY]);
            k.setRegion(data[ContactEntry.REGION]);
            k.setCountry(data[ContactEntry.COUNTRY]);
            klanten.add(k);
        }
        return klanten;
    }

    public static void main(String[] args) {
        try {
            ContactReader kr = new ContactReader();
            kr.printData();
            System.out.println("---------------------------------------------------------------");
            for (ContactEntry ke : kr.getEntries()) {
                String[] data = ke.getData();
                // we drukken het ID en bijhorende naam van elke klant
                System.out.println("ID=" + data[ContactEntry.ID] + ",  name=" + data[ContactEntry.NAMECLIENT]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
