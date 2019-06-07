package Homework;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Animal animal = new Animal();
        animal.name = "Mike";
        animal.age = 2;
        animal.health = 9;
        animal.happiness = 10;
        animal.starving = 4;
        animal.favoriteFood = "Biscuits";
        animal.favoritePastime = "Swimming";


        Adopter adopter = new Adopter();
        adopter.name = "Alex";
        adopter.wallet = 100.50;


        PetFood petFood = new PetFood();
        petFood.name = "Biscuits";
        petFood.price = 12.99;
        petFood.quantity = 10;
        petFood.expirationDate = "01 Jan 2020";
        petFood.stockAvailability = true;


        Pastime pastime = new Pastime();
        pastime.name = "Swimming";


        Veterinary veterinary = new Veterinary();
        veterinary.name = "Marius";
        veterinary.specialization = "surgeon";



    }
}
