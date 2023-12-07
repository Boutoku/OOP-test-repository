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
public class ClientReader {
    private String format;
    private ArrayList<ClientEntry> entries;

    public ClientReader() {
        this("clients.csv");
    }

    public ClientReader(String filename) {
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
                ClientEntry entry = new ClientEntry(klantlijn);
                entries.add(entry);
            }
            klantfile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Er dook een probleem op: " + e.getMessage());
        }
    }

    public ArrayList<ClientEntry> getEntries() {
        return entries;
    }

    /**
     * Print de data.
     */
    public void printData() {
        for (ClientEntry entry : entries) {
            System.out.println(entry);
        }
    }

    public HashSet<Client> loadClients() {
        HashSet<Client> klanten = new HashSet<>();
        for(ClientEntry ke : getEntries()) {
            String[] data = ke.getData();
            Client k = new Client(data[ClientEntry.ID]);
            k.setName(data[ClientEntry.NAMECLIENT]);
            k.setNameContact(data[ClientEntry.NAMECONTACT]);
            k.setTitleContact(data[ClientEntry.TITLECONTACT]);
            k.setCity(data[ClientEntry.CITY]);
            k.setRegion(data[ClientEntry.REGION]);
            k.setCountry(data[ClientEntry.COUNTRY]);
            klanten.add(k);
        }
        return klanten;
    }

    public static void main(String[] args) {
        try {
            ClientReader kr = new ClientReader();
            kr.printData();
            System.out.println("---------------------------------------------------------------");
            for (ClientEntry ke : kr.getEntries()) {
                String[] data = ke.getData();
                // we drukken het ID en bijhorende naam van elke klant
                System.out.println("ID=" + data[ClientEntry.ID] + ",  name=" + data[ClientEntry.NAMECLIENT]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
