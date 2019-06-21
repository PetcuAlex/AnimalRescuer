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

        Animal animal = new Animal("Mike");
        animal.age = 2;
        animal.health = 9;
        animal.happiness = 10;
        animal.starving = 4;
        animal.favoriteFood = "Biscuits";
        animal.favoritePastime = "Running";

        Fish fish = new Fish("Marius");
        fish.finsNumber = 5;
        fish.needMoreOxygenedWater = true;
        fish.age = 2;
        fish.health = 9;
        fish.happiness = 10;
        fish.starving = 4;
        fish.favoriteFood = "Biscuits";
        fish.favoritePastime = "Swimming";


        Adopter adopter = new Adopter("Alex");
        adopter.wallet = 100.50;

        Adopter adopter2 = new Adopter("Emilian");
        adopter2.wallet = 72.68;




        PetFood petFood = new PetFood(LocalDate.of(2020,05,20));
        petFood.foodName = "Biscuits";
        petFood.price = 12.99;
        petFood.quantity = 10;
        petFood.stockAvailability = true;

        PetFood petFood2 = new PetFood(LocalDate.of(2020,10,14));
        petFood2.foodName = "Lettuce";
        petFood2.price = 12.99;
        petFood2.quantity = 10;
        petFood2.expirationDate = petFood.expirationDate;
        petFood2.stockAvailability = true;


        Pastime pastime = new Pastime("Swimming");


        Veterinary veterinary = new Veterinary("Marius");
        veterinary.specialization = "surgeon";


        System.out.println("Expiration date is " + petFood.expirationDate);

       adopter.feed(animal.name, petFood.foodName);
       adopter2.feed(fish.name, petFood2.foodName);

       adopter.walking(animal.name,animal.favoritePastime);
       adopter2.walking(fish.name, fish.favoritePastime);

       Nurse nurse = new Nurse("Maria");
       nurse.callingPatient = " Hey! Come in!";

        System.out.println(nurse.name+  ": " + nurse.callingPatient);


























    }
}
