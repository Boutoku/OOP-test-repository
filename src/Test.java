public class Test {
    public static void main(String[] args) {
        /*
        ContactManager cm = new ContactManager();
        cm.printContacts();
        */

        Relation r = new Relation("","",0);
        r.setName("Yvonne Moncada");
        r.setDescription("only met once with a small talk");
        r.setStars(3);
        System.out.println(r.toString());

    }
}
