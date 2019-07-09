package Homework;

public class Adopter {

    private String adopterName;
    private double wallet;
    private int age;
    private String hairColor;
    private String genere;
    private String job;


    public Adopter(String adopterName) {
        this.adopterName = adopterName;
    }

    public void feed(Animal animal,PetFood petFood ){

        System.out.println(adopterName + " just gave " + petFood.getFoodName() + " food to " + animal.getName());
        int newStarvingLevel = animal.getStarving();
        newStarvingLevel--;
        System.out.println("Your starving level is: " + newStarvingLevel);




    }

    public void entertain(Animal animal,Pastime pastime){

        System.out.println(adopterName + " just go " + pastime.getName() + "  with " + animal.getName());
        int newHappinessLevel = animal.getHappiness();
        newHappinessLevel++;
        System.out.println("Your pet is now happy!Happiness level: " + newHappinessLevel);



    }


    public String getAdopterName() {
        return adopterName;
    }

    public void setAdopterName(String adopterName) {
        this.adopterName = adopterName;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
