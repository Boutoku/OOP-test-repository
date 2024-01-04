public class Test {
    public static void main(String[] args) {
        ContactManager cm = new ContactManager();
        System.out.println(cm.getNumberOfContacts());

        System.out.println(cm.getNumberOfContacts("Owner"));
    }

}
