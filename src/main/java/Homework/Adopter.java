package Homework;

public class Adopter {

    String adopterName;
    double wallet;
    int age;
    String hairColor;
    String genere;
    String job;


    public void feed(String nameAnimal, String nameFood ){

        System.out.println(adopterName + " just gave " + nameFood + " food to " + nameAnimal);


    }

    public void walking(String nameAnimal, String nameActivity){

        System.out.println(adopterName + " just go " + nameActivity + "  with " + nameAnimal);


    }



}
