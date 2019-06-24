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
        animal.setAge(2);
        animal.setHealth(9);
        animal.setHappiness(10);
        animal.setStarving(4);
        animal.setFavoriteFood("Biscuits");
        animal.setFavoritePastime("Running");

        Fish fish = new Fish("Marius");
        fish.setFinsNumber(5);
        fish.setNeedMoreOxygenedWater(true);
        fish.setAge(2);
        fish.setHealth(9);
        fish.setHappiness(10);
        fish.setStarving(4);
        fish.setFavoriteFood("Biscuits");
        fish.setFavoritePastime("Swimming");


        Adopter adopter = new Adopter("Alex");
        adopter.setWallet(100.50);

        Adopter adopter2 = new Adopter("Emilian");
        adopter2.setWallet(72.68);




        PetFood petFood = new PetFood(LocalDate.of(2020,05,20));
        petFood.setFoodName("Biscuits");
        petFood.setPrice(12.99);
        petFood.setQuantity(10);
        petFood.setStockAvailability(true);

        PetFood petFood2 = new PetFood(LocalDate.of(2020,10,14));
        petFood2.setFoodName("Lettuce");
        petFood2.setPrice(12.99);
        petFood2.setQuantity(10);
        petFood2.setExpirationDate(petFood.getExpirationDate());
        petFood2.setStockAvailability(true);


        Pastime pastime = new Pastime("Swimming");


        Veterinary veterinary = new Veterinary("Marius");
        veterinary.setSpecialization("surgeon");


        System.out.println("Expiration date is " + petFood.getExpirationDate());

       adopter.feed(animal.getName(), petFood.getFoodName());
       adopter2.feed(fish.getName(), petFood2.getFoodName());

       adopter.walking(animal.getName(), animal.getFavoritePastime());
       adopter2.walking(fish.getName(), fish.getFavoritePastime());

       Nurse nurse = new Nurse("Maria");
       nurse.setCallingPatient(" Hey! Come in!");

        System.out.println(nurse.getName() +  ": " + nurse.getCallingPatient());


























    }
}
