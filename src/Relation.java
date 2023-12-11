public class Relation {
    String name;
    String description;
    int stars;

    public Relation(String name, String description, int stars) {
        this.name = name;
        this.description = description;
        this.stars = stars;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getStars() {
        return stars;
    }
    public String toString(){
        return "Relation with " + name + " (" + description + ") " + " - " + "*".repeat(stars);
    }
}
