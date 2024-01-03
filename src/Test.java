public class Test {
    public static void main(String[] args) {

       /*ContactManager cm = new ContactManager();
       cm.printContacts();

       Relation r = new Relation("Yvonne Moncada", "only met once with a small talk", 3);
       System.out.println(r.toString());*/

        Contact c = new Contact("QUICK");
        Relation r1 = new Relation("Yvonne Moncada", "only met once with a small talk", 3);
        Relation r2 = new Relation("Marie Bertrand", "very important contact", 5);
        Relation r3 = new Relation("Sofia Alcanat", "very mysterious", 2);
        Relation r4 = new Relation("Marie Bertrand", "big problems, made a mess", 1);
        Relation r5 = new Relation("Paolo Accorti", "", 0);
        c.addRelation(r1);
        c.addRelation(r2);
        c.addRelation(r3);
        c.addRelation(r4);
        c.addRelation(r5);

        c.printRelations();

    }

}
