public class Test {
    public static void main(String[] args) {

       ContactManager cm = new ContactManager();
       cm.printContacts();

       Relation r = new Relation("Yvonne Moncada", "only met once with a small talk", 3);
       System.out.println(r.toString());
    }
}
