/**
 *
 * @author marc
 */
public class ContactEntry {
    private String[] dataValues;
    
    public static final int ID = 0;
    public static final int NAMECLIENT = 1;
    public static final int NAMECONTACT = 2;
    public static final int TITLECONTACT = 3;
    public static final int ADDRESS = 4;
    public static final int CITY = 5;
    public static final int REGION = 6;
    public static final int ZIP = 7;
    public static final int COUNTRY = 8;
    public static final int PHONE = 9;
    public static final int FAX = 10;
    private static final int NUMBER_OF_FIELDS = 11;
                      
    public ContactEntry(String klantlijn)
    {
        // The array to store the data for a single line.
        dataValues = new String[NUMBER_OF_FIELDS];
        // Break up the line.
        ContactlineTokenizer tokenizer = new ContactlineTokenizer();
        tokenizer.tokenize(klantlijn,dataValues);
    }
    
    /**
     * Deze methode retourneert een array van strings met de volgende info:
     *   ID = 0 => dataValues[ID] = id klant
     *   NAMECLIENT = 1 => dataValues[NAAMKLANT] = naam van de klant etc.
     *   NAMECONTACT = 2, TITLECONTACT = 3, ADDRESS = 4, CITY = 5, REGION = 6, ZIP = 7, COUNTRY = 8, PHONE = 9, FAX = 10
     * @return dataValues Array met alle informatie over één klant
     */
    public String[] getData()
    {
        return dataValues;
    }
    
    public String toString() {
        String ret = "";
        for (String dataValue : dataValues) {
            ret += dataValue + ";";
        }
        return ret.substring(0, ret.length() - 1);
    }
}
