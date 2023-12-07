public class Client {
    private String ID;
    private String name;
    private String nameContact;
    private String titleContact;
    private String city;
    private String region;
    private String country;

    public Client(String id) {
        ID = id;
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

    public String getNameContact() {
        return nameContact;
    }

    public void setNameContact(String nameContact) {
        this.nameContact = nameContact;
    }

    public String getTitleContact() {
        return titleContact;
    }

    public void setTitleContact(String titleContact) {
        this.titleContact = titleContact;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
        return nameContact + " (" + titleContact + "), " + country + " (" + city + ")";
    }
}