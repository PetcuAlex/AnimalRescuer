package Homework;


import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Animal animal = new Animal("Tom");
        animal.setAge(1);
        animal.setFavoriteFood("Cheese");
        animal.setFavoritePastime("Running");



        Dog dog = new Dog("Mike" ,"Bulldog");
        dog.setAge(2);
        dog.setHealth(9);
        dog.setHappiness(10);
        dog.setStarving(4);
        dog.setFavoriteFood("Biscuits");
        dog.setFavoritePastime("Running");

        Fish fish = new Fish("Marius");
        fish.setSpecies("Golden Fish");
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


        Pastime pastime = new Pastime("swimming");
        Pastime pastime2 = new Pastime("running");


        Veterinary veterinary = new Veterinary("Marius");
        veterinary.setSpecialization("surgeon");


        System.out.println("Expiration date is " + petFood.getExpirationDate());

       adopter.feed(dog,petFood);
       adopter2.feed(fish,petFood2);

       adopter.entertain(dog,pastime2);
       adopter2.entertain(fish,pastime);

//       Nurse nurse = new Nurse("Maria");
//       nurse.setCallingPatient(" Hey! Come in!");
//
//        System.out.println(nurse.getName() +  ": " + nurse.getCallingPatient());
//
//        animal.expressHappines();
//        dog.expressHappines();
//        fish.expressHappines();
//
//        Animal dog2 = new Dog("Spike", "Husky");
//        dog2.expressHappines();
//        Animal fish2 = new Fish("Luie");
//        fish2.expressHappines();
//        Animal animal2 = new Animal("Dora");
//        animal2.expressHappines();



























    }
}
