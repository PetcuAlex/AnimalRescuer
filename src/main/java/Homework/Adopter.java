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

    public void feed(Animal animal, PetFood petFood) {

        System.out.println(adopterName + " just gave " + petFood.getFoodName() + " food to " + animal.getName());
        animal.setStarving(animal.getStarving() - 1);
        System.out.println("Your starving level is: " + animal.getStarving());
        if (petFood.getFoodName().equals(animal.getFavoriteFood())){
            int newHappinessLevel = animal.getHappiness();
            newHappinessLevel++;
            System.out.println("You fed your pet with his favorite food,so he is happier now.Happiness level is :" + newHappinessLevel);
        }


    }
    public void goToDoctor(Animal animal, Veterinary veterinary){
        System.out.println(adopterName + " is taking " + animal.getName() + " to " + veterinary.getName());
        System.out.println("Now " + animal.getName() + " is scared and his happines level decreased to " + animal.getHappiness());
    }

    public void entertain(Animal animal, Pastime pastime) {

        System.out.println(adopterName + " just go " + pastime.getName() + "  with " + animal.getName());
        int newHappinessLevel = animal.getHappiness();
       if (pastime.getName().equals(animal.getFavoritePastime())){
           newHappinessLevel +=2;
           System.out.println("You do your pet's favorite activity so it's happiness level is bigger: " + newHappinessLevel);
       }else{
           newHappinessLevel++;
           System.out.println("Your happiness level is: " +newHappinessLevel);
       }


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
