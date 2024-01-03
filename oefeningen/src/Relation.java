public class Relation {
    private String name;
    private String description;
    private int stars;

    public Relation(String name,String description,int stars){
        setName(name);
        setDescription(description);
        setStars(stars);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String toString(){
        String description = getDescription();
        if (description.length() > 10) {
            return "Relation with " + getName() + " (" + description.substring(0, 10) + "...) - "
                    + "*".repeat(stars);
        } else {
            return "Relation with " + getName() + " (" + description + ") - "
                    + "*".repeat(stars);
        }
    }
}
