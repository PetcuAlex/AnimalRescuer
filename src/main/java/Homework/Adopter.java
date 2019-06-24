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

    public void feed(String nameAnimal, String nameFood ){

        System.out.println(adopterName + " just gave " + nameFood + " food to " + nameAnimal);


    }

    public void walking(String nameAnimal, String nameActivity){

        System.out.println(adopterName + " just go " + nameActivity + "  with " + nameAnimal);


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
