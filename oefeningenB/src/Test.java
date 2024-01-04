public class Test {
    public static void main(String[] args) {
        ContactManager cm = new ContactManager();

        System.out.println(cm.getNumberOfContacts());

        System.out.println(cm.getNumberOfContacts("Owner"));

        cm.printContactsPerTitle();

        System.out.println(cm.removeContacts("Accounting Manager"));
        System.out.println(cm.getNumberOfContacts());
    }

}
