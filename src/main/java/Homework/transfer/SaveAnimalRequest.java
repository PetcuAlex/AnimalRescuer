package Homework.transfer;

public class SaveAnimalRequest {

    private String name;
    private int starving;
    private int happiness;
    private int health;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStarving() {
        return starving;
    }

    public void setStarving(int starving) {
        this.starving = starving;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "SaveAnimalRequest{" +
                "name='" + name + '\'' +
                ", starving=" + starving +
                ", happiness=" + happiness +
                ", health=" + health +
                '}';
    }
}
