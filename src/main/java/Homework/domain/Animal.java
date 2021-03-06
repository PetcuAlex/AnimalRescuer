package Homework.domain;

public class Animal {

    private long id;
    private String name;
    private int age;
    private int health;
    int starving;
    private int happiness;
    private String favoriteFood;
    private String favoritePastime;
    private int height;
    private int weight;



    public void expressHappines(){

        System.out.println(getName() + " is happy");

    }


//    public Animal(String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
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

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoritePastime() {
        return favoritePastime;
    }

    public void setFavoritePastime(String favoritePastime) {
        this.favoritePastime = favoritePastime;
    }


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return ", health=" + health +
                ", starving=" + starving +
                ", happiness=" + happiness +
                '}';
    }
}
