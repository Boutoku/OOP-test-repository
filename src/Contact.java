import java.util.HashSet;

public class Contact {
    private String ID;
    private String name;
    private String title;
    private String city;
    private String zip;
    private String region;
    private String country;
    private HashSet<Relation> relationsMap = new HashSet<>();

    public Contact(String id) {
        ID = id;
    }

    public void addRelation(Relation relation) {
        for (Relation rel : relationsMap) {
            if (rel.getName().equals(relation.getName())) {
                relationsMap.remove(rel); // Remove the existing relation
                break;
            }
        }
        relationsMap.add(relation); // Add the new relation
    }


    public int getNumberOfRelations(){
        int numberOfRelations = 0;
        for (int i = 0; i < relationsMap.size(); i++){
            numberOfRelations++;
        };
        return numberOfRelations;
    }

    public void printRelations() {
        relationsMap.forEach(System.out::println);
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String toString() {
        return name + " (" + title + "), " + country + " (" + city + ")";
    }
}