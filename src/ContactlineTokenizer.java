import java.util.Scanner;

/**
 * Break up line from a web server log file into its separate fields. Currently,
 * the log file is assumed to contain simply integer date and time information.
 *
 * @author David J. Barnes and Michael Kolling.
 * @version 2008.03.30
 */
public class ContactlineTokenizer {

    public ContactlineTokenizer() {
    }

    public void tokenize(String klantlijn, String[] dataLijn) {
        try {
            // Scan the line
            Scanner tokenizer = new Scanner(klantlijn).useDelimiter(";");
            for (int i = 0; i < dataLijn.length; i++) {
                String s = tokenizer.next();
                if (s.length()>0 && s.charAt(0) == '"') {
                    s = s.substring(1);
                }
                if (s.length()>0 && s.charAt(s.length() - 1) == '"') {
                    s = s.substring(0, s.length() - 1);
                }
                dataLijn[i] = s;
            }
        } catch (java.util.NoSuchElementException e) {
            System.out.println("datalijn is onvolledig: " + klantlijn);
            throw e;
        }
    }
}
