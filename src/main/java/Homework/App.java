package Homework;


import java.time.LocalDate;
import java.time.ZoneId;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Mammals mammal = new Mammals();
        mammal.species = "Dog";
        mammal.furColor = "Black";
        mammal.name = "Mike";
        mammal.age = 2;
        mammal.health = 9;
        mammal.happiness = 10;
        mammal.starving = 4;
        mammal.favoriteFood = "Biscuits";
        mammal.favoritePastime = "Running";
        mammal.talk = "Woof! Woof! Woof!";


        Fish fish = new Fish();
        fish.finsNumber = 5;
        fish.needMoreOxygenedWater = true;
        fish.name = "Mike";
        fish.age = 2;
        fish.health = 9;
        fish.happiness = 10;
        fish.starving = 4;
        fish.favoriteFood = "Biscuits";
        fish.favoritePastime = "Swimming";


        Adopter adopter = new Adopter();
        adopter.name = "Alex";
        adopter.wallet = 100.50;


        PetFood petFood = new PetFood();
        petFood.name = "Biscuits";
        petFood.price = 12.99;
        petFood.quantity = 10;
        petFood.expirationDate = LocalDate.now();
        petFood.stockAvailability = true;


        Pastime pastime = new Pastime();
        pastime.name = "Swimming";


        Veterinary veterinary = new Veterinary();
        veterinary.name = "Marius";
        veterinary.specialization = "surgeon";
        System.out.println("Expiration date is " + petFood.expirationDate.plusMonths(12));



    }
}
