package Homework.domain;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class Game {

    private Adopter player;
    private Animal pet;
    private Veterinary doctor;
    private PetFood food1, food2, food3;
    private PetFood[] availableFood = new PetFood[4];
    private Pastime[] availableActivities = new Pastime[3];
    private Jobs[] availableJobs = new Jobs[3];
    private int day = 1;

    void start() {

        initFood();
        initActivities();
        initJobs();
        initVeterinary();
        initAdopter();
        initAniaml();

        while (pet.getHealth() != 0) {
            System.out.println("Day " + day++);
            if (pet.getHappiness() > 10) {
                System.out.println("Your happiness level is full.");
                pet.setHappiness(10);
            }
            if (pet.getStarving() > 10) {
                pet.setStarving(10);
            }
            if (pet.getHealth() > 10) {
                pet.setHealth(10);
            }
            if (day == 5) {
                player.getJob().setRank(2);
                player.getJob().setPayday(player.getJob().getPayday() + 5);
            } else if (day == 10) {
                player.getJob().setRank(3);
                player.getJob().setPayday(player.getJob().getPayday() + 5);

            } else if (day == 15) {
                player.getJob().setRank(4);
                player.getJob().setPayday(player.getJob().getPayday() + 10);

            } else if (day == 25) {
                player.getJob().setRank(5);
                player.getJob().setPayday(player.getJob().getPayday() + 25);

            }
            int timesNearDeath = 0;
            if (pet.getHappiness() < 10) {
                requireActivity();
            }
            if (pet.getStarving() < 10) {
                requireFeed();
            }
            if (pet.getStarving() >= 5) {
                System.out.println("Your pet is starving to death!Feed him!");
                pet.setHealth(pet.getHealth() - 2);

            } else if (pet.getStarving() > 2 & pet.getStarving() < 5) {
                System.out.println("Your pet is really hungry.You should feed him!");
                pet.setHealth(pet.getHealth() - 1);
            }
            if (pet.getHealth() <= 0) {
                System.out.println("Your pet stopped breathing!Call an ambulance right now!");
                System.out.println("Call ambulance?");
                String response = getAmbluanceResponseFromUser();
                if (response.equalsIgnoreCase("yes")) {
                    player.goToDoctor(pet, doctor);
                    doctor.examinate(pet);
                    doctor.diagnostic(pet);
                    doctor.doSurgery(pet);
                    timesNearDeath++;
                    if (pet.getHealth() == -20) {
                        System.out.println("Your pet is dead , shame on you!");
                        break;
                    }
                } else if (response.equalsIgnoreCase("no")) {
                    System.out.println("Your pet died!Shame on you!You could save him!");
                    break;
                }

            }
            if (timesNearDeath == 3) {
                doctor.contactAnimalProtection(pet);
                System.out.println("You lost that game!");
                break;
            }
            if (pet.getHealth() < 5) {
                requireMedicine();
            }
            System.out.println("Your pet health is: " + pet.getHealth());

            player.work();
            pet.setHappiness(pet.getHappiness() - 1);
            requireActivity();
            requireFeed();
            endDay();

        }


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
//        adopter2.entertain(fish,pa
    }

    private void endDay() {
        System.out.println("You completed this day!");
        System.out.println("Your pet stats are" + pet);
        System.out.println("Sleeping...Zzzzz...Zzzzz...");
    }

    private String getAmbluanceResponseFromUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Yes or no?");
        return in.nextLine();
    }

    private void initAniaml() {

        Scanner in = new Scanner(System.in);
        System.out.println("You want a dog or a fish?");
        String chooseAnimal = in.nextLine();
        if (chooseAnimal.equalsIgnoreCase("dog")) {
            pet = new Dog();
//            dog = (Dog) pet;
//            pet.setFurColor("Black");
//            pet.setSpecies("Bulldog");
            pet.setName(getAnimalNameFromUser());
            pet.setStarving(5);
            pet.setHappiness(5);
            pet.setHealth(10);
            pet.setAge(1);
            pet.setFavoriteFood("Biscuits");
            pet.setFavoritePastime("Running");
            System.out.println("You choose a dog and his name is " + pet.getName());

        } else if (chooseAnimal.equalsIgnoreCase("fish")) {
            pet = new Fish();
//            fish = (Fish) pet;
            pet.setName(getAnimalNameFromUser());
            pet.setStarving(5);
            pet.setHappiness(5);
            pet.setHealth(10);
            pet.setAge(1);
            pet.setFavoriteFood("Lettuce");
            pet.setFavoritePastime("Swimming");
            System.out.println("You choose a fish and his name is " + pet.getName());


        }

    }

    private void initVeterinary() {
        doctor = new Veterinary("Dr.Trevor");

    }

    private void requireMedicine() {
        System.out.println("Your pet is ill!You should go to a doctor.Do you want?");
        String response = getResponseForMedicineFromUser();
        if (response.equalsIgnoreCase("yes")) {
            player.goToDoctor(pet, doctor);
            doctor.examinate(pet);
            doctor.giveMedicine(pet);
        } else if (response.equalsIgnoreCase("no")) {
            System.out.println("You should be more responsable!");
        }
    }

    private String getResponseForMedicineFromUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your response:");
        return in.nextLine();
    }

    private void requireFeed() {
        Scanner in = new Scanner(System.in);
        System.out.println("Your pet is hungry.Feed your pet!");
        System.out.println("Do you want?");
        String response = getResponseFromUser();
        if (response.equalsIgnoreCase("yes")) {
            displayFood();
            System.out.println("Choose food:");
            PetFood food = getFoodSelectedByUser();
            if (food.getQuantity() <= 0) {
                System.out.println("You need to buy some food!");
                buyFood(player);
            }
            player.feed(pet, food);
        } else if (response.equalsIgnoreCase("no")) {
            pet.setStarving(pet.getStarving() + 1);
            pet.setHealth(pet.getHealth() - 1);
            System.out.println("You didn't fed your pet!You starving level now is: " + pet.getStarving());
        }


    }

    private String getResponseFromUser() {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter your response:Yes or no?");
            return in.nextLine();
        } catch (InputMismatchException e) {
            return getResponseFromUser();
        }
    }

    private void requireActivity() {
        Scanner in = new Scanner(System.in);
        System.out.println("Your pet is sad.Do an activity with your pet!");
        System.out.println("Do you want?");
        String response = getResponseFromUser();
        if (response.equalsIgnoreCase("yes")) {
            displayActivities();
            System.out.println("Choose an activity:");
            Pastime activity = getActivitySelectedByUser();
            player.entertain(pet, activity);
        } else if (response.equalsIgnoreCase("no")) {
            pet.setHappiness(pet.getHappiness() - 1);
            System.out.println("Your pet hapiness decreased to: " + pet.getHappiness());
            pet.setHealth(pet.getHealth()-1);
            System.out.println("Your pet health decreased to: " + pet.getHealth());
        }


    }

    private PetFood getFoodSelectedByUser() {
        System.out.println("Please enter food number:");
        try {
            Scanner in = new Scanner(System.in);
            int foodNumber = in.nextInt();
            PetFood petFood = availableFood[foodNumber - 1];
            return petFood;
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
            System.out.println("You entered an invalid food number.Please try again...");
            return getFoodSelectedByUser();
        }

    }

    private Jobs getAdopterJobFromUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter job number:");
        displayJobs();
        int jobNumber = in.nextInt();
        Jobs jobs = availableJobs[jobNumber - 1];
        return jobs;
    }

    private Pastime getActivitySelectedByUser() {
        System.out.println("Please enter activity number:");
        try {
            Scanner in = new Scanner(System.in);
            int activityNumber = in.nextInt();
            Pastime pastime = availableActivities[activityNumber - 1];
            return pastime;
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
            System.out.println("You entered an invalid avtivity number.Please try again...");
            return getActivitySelectedByUser();
        }

    }

    private void initAdopter() {

        player = new Adopter(getAdopterNameFromUser());

        player.setAge(getAdopterAgeFromUser());
        player.setGenere(getAdopterGenereFromUser());
        player.setWallet(200);
        player.setJob(getAdopterJobFromUser());
        System.out.println("Welcome, " + player.getAdopterName() + ".You now work as a " + player.getJob() + " and now you are ready to take a pet.");

    }

    private String getAdopterNameFromUser() {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter your name:");
            return in.nextLine();
        } catch (InputMismatchException e) {
            return getAdopterNameFromUser();
        }
    }


    private int getAdopterAgeFromUser() {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter your age:");
            return in.nextInt();
        } catch (InputMismatchException | NullPointerException e) {
            System.out.println("Invalid input");
            return getAdopterAgeFromUser();
        }
    }

    private String getAdopterGenereFromUser() {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter your genere:");
            return in.nextLine();
        } catch (InputMismatchException e) {
            return getAdopterGenereFromUser();
        }
    }

    private String getAnimalNameFromUser() {
        System.out.println("Enter you animal's name:");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }


    private void displayFood() {
        System.out.println("Available food:");
        for (int i = 0; i < availableFood.length; i++) {
            if (availableFood[i] != null) {
                System.out.println((i + 1) + ". " + availableFood[i].getFoodName() + ": " + availableFood[i].getQuantity());
            }
        }


    }

    private void displayJobs() {
        System.out.println("Available jobs:");
        for (int k = 0; k < availableJobs.length; k++) {
            if (availableJobs[k] != null) {
                System.out.println((k + 1) + ". " + availableJobs[k].getJobName() + ": " + availableJobs[k].getPayday() + " $/day");
            }
        }


    }

    private void displayActivities() {
        System.out.println("Available activities:");
        for (int j = 0; j < availableActivities.length; j++) {
            if (availableActivities[j] != null) {
                System.out.println((j + 1) + ". " + availableActivities[j].getName());
            }
        }


    }
//    private void initInventory(){
//        inventory[0] = 0;
//        inventory[1] = 0;
//        inventory[2] = 0;
//        inventory[3] = 0;


    private int getAmountOfFoodFromUser() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private void buyFood(Adopter adopter) {
        Scanner in = new Scanner(System.in);
        System.out.println("What do you want to buy?");
        displayFood();
        PetFood boughtFood = getFoodSelectedByUser();
        System.out.println("How many do you want?");
        int amount = getAmountOfFoodFromUser();
        if (player.getWallet() < boughtFood.getPrice() * amount) {
            System.out.println("Sorry you can't afford to buy this!Try to buy something you have money for");
            System.out.println("Continue shopping?Yes or no?");
            String response = getResponseFromUser();
            if (response.equalsIgnoreCase("yes")) {
                buyFood(player);
            } else if (response.equalsIgnoreCase("no")) {
                System.out.println("Good bye!");

            }

        } else {
            System.out.println("You bought " + amount + " " + boughtFood.getFoodName());
            adopter.setWallet(adopter.getWallet() - boughtFood.getPrice() * amount);
            System.out.println("The total is: " + boughtFood.getPrice() * amount);
            System.out.println("Current ballance is: " + adopter.getWallet());
            boughtFood.setQuantity(boughtFood.getQuantity() + amount);
            System.out.println("You know have " + boughtFood.getQuantity() + " " + boughtFood.getFoodName());
            System.out.println("Do you want to buy something else?");
            if (in.nextLine().equalsIgnoreCase("yes")) {
                buyFood(player);
            } else if (in.nextLine().equalsIgnoreCase("no")) {
                System.out.println("Good bye!");
            }
        }
    }

    private void initJobs() {
        Jobs job = new Jobs();
        job.setJobName("Cooker");
        job.setPayday(ThreadLocalRandom.current().nextInt(10, 25));
        job.setRank(1);
        availableJobs[0] = job;
        Jobs job2 = new Jobs();
        job2.setJobName("Bartender");
        job2.setPayday(ThreadLocalRandom.current().nextInt(10, 25));
        job2.setRank(1);
        availableJobs[1] = job2;
        Jobs job3 = new Jobs();
        job3.setJobName("Bus Driver");
        job3.setPayday(ThreadLocalRandom.current().nextInt(10, 25));
        job3.setRank(1);
        availableJobs[2] = job3;
    }

    private void initFood() {

        food1 = new PetFood();
        food1.setFoodName("biscuits");
        food1.setPrice(10);
        food1.setQuantity(0);
        availableFood[0] = food1;
        food2 = new PetFood();
        food2.setFoodName("meat");
        food2.setPrice(25);
        food2.setQuantity(0);
        availableFood[1] = food2;
        food3 = new PetFood();
        food3.setFoodName("lettuce");
        food3.setPrice(5);
        food3.setQuantity(0);
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


