package Homework;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Game {

    private PetFood[] availableFood = new PetFood[3];
    private Pastime[] availableActivities = new Pastime[3];


    public void start() {

        initFood();
        displayFood();
        initActivities();
        displayActivities();

//        Animal animal = new Animal("Tom");
//        animal.setAge(1);
//        animal.setFavoriteFood("Cheese");
//        animal.setFavoritePastime("Running");
//
//
//
//        Dog dog = new Dog("Mike" ,"Bulldog");
//        dog.setAge(2);
//        dog.setHealth(9);
//        dog.setHappiness(10);
//        dog.setStarving(4);
//        dog.setFavoriteFood("Biscuits");
//        dog.setFavoritePastime("Walking");
//
//        Fish fish = new Fish("Marius");
//        fish.setSpecies("Golden Fish");
//        fish.setFinsNumber(5);
//        fish.setNeedMoreOxygenedWater(true);
//        fish.setAge(2);
//        fish.setHealth(9);
//        fish.setHappiness(10);
//        fish.setStarving(4);
//        fish.setFavoriteFood("Biscuits");
//        fish.setFavoritePastime("Swimming");
//
//
//        Adopter adopter = new Adopter("Alex");
//        adopter.setWallet(100.50);
//
//        Adopter adopter2 = new Adopter("Emilian");
//        adopter2.setWallet(72.68);
//
//
//
//
//        PetFood petFood = new PetFood(LocalDate.of(2020,05,20));
//        petFood.setFoodName("Biscuits");
//        petFood.setPrice(12.99);
//        petFood.setQuantity(10);
//        petFood.setStockAvailability(true);
//
//        PetFood petFood2 = new PetFood(LocalDate.of(2020,10,14));
//        petFood2.setFoodName("Lettuce");
//        petFood2.setPrice(12.99);
//        petFood2.setQuantity(10);
//        petFood2.setExpirationDate(petFood.getExpirationDate());
//        petFood2.setStockAvailability(true);
//
//
//        Pastime pastime = new Pastime("Swimming");
//        Pastime pastime2 = new Pastime("Running");
//
//
//        Veterinary veterinary = new Veterinary("Marius");
//        veterinary.setSpecialization("surgeon");
//
//
//        System.out.println("Expiration date is " + petFood.getExpirationDate());
//
//        adopter.feed(dog,petFood2);
//        System.out.println();
//        adopter2.feed(fish,petFood);
//        System.out.println();
//
//        adopter.entertain(dog,pastime2);
//        System.out.println();
//        adopter2.entertain(fish,pastime);
    }

    private void displayFood() {
        System.out.println("Available food:");
        for (int i = 0; i < availableFood.length; i++) {
            if (availableFood[i] != null) {
                System.out.println((i + 1) + ". " + availableFood[i].getFoodName());
            }
        }


    }

    private void displayActivities() {
        System.out.println("Available food:");
        for (int j = 0; j < availableActivities.length; j++) {
            if (availableActivities[j] != null) {
                System.out.println((j + 1) + ". " + availableActivities[j].getName());
            }
        }


    }


    private void initFood() {

        PetFood food1 = new PetFood();
        food1.setFoodName("biscuits");
        availableFood[0] = food1;
        PetFood food2 = new PetFood();
        food2.setFoodName("meat");
        availableFood[1] = food2;
        PetFood food3 = new PetFood();
        food3.setFoodName("lettuce");
        availableFood[2] = food3;


    }


    private void initActivities() {

        Pastime pastime1 = new Pastime();
        pastime1.setName("Swimming");
        availableActivities[0] = pastime1;
        Pastime pastime2 = new Pastime();
        pastime2.setName("Running");
        availableActivities[1] = pastime2;
        Pastime pastime3 = new Pastime();
        pastime3.setName("Walking");
        availableActivities[2] = pastime3;


    }
}


