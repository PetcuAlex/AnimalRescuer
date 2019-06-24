package Homework;

public class Pastime {

    private String name;
    private boolean availabilty;

    public Pastime(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailabilty() {
        return availabilty;
    }

    public void setAvailabilty(boolean availabilty) {
        this.availabilty = availabilty;
    }
}
