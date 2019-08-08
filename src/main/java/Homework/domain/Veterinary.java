package Homework.domain;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Veterinary extends MedicalStaff {

    private String giveDiagnostic;
    private String doSurgery;
    private String doExamination;
    private String giveMedicine;

    public void examinate(Animal animal){
        Scanner in = new Scanner(System.in);
        System.out.println(getName() + " is looking at " + animal.getName());
        System.out.println("Let's see what your pet has!");
        System.out.println("Type 'major' ");

    }

    public void giveMedicine( Animal animal){
        System.out.println(getName() + " gave some pills to " + animal.getName());
        animal.setHealth(animal.getHealth() + 3);
    }

    public void diagnostic(Animal animal){
        Scanner in = new Scanner(System.in);
        String petDiagnostic = in.nextLine();
        if (petDiagnostic.equalsIgnoreCase("minor")) {
            System.out.println("Your pet is ill,so i will give him some pills , and you should feed him to get strength");
        }else if (petDiagnostic.equalsIgnoreCase("major")){
            System.out.println("Your pet have respiratory failure!");
        }
    }
    public void doSurgery(Animal animal){
        System.out.println("I'm sorry to to say that, but you didn't take care of your pet,and I'm not sure if he will survive.");
        int resultOfSurgery = ThreadLocalRandom.current().nextInt(1,3);
        if (resultOfSurgery==1){
            System.out.println("I'm glad to inform you that your pet survived the surgery and now you need to take care of him");
            animal.setHappiness(2);
            animal.setHealth(6);
            animal.setStarving(3);

        }else if(resultOfSurgery>1){
            System.out.println("I'm sorry to inform you , but your pet didn't make it...");
            animal.setHealth(-20);
        }
    }

    public void contactAnimalProtection(Animal animal){
        System.out.println(getName() + "sesizated the authorities that you don't have the ability to take care of a pet.");
        System.out.println("Animal Protection took " + animal.getName());
    }



    public Veterinary(String name) {
        super(name);
    }

    public String getGiveDiagnostic() {
        return giveDiagnostic;
    }

    public void setGiveDiagnostic(String giveDiagnostic) {
        this.giveDiagnostic = giveDiagnostic;
    }

    public String getDoSurgery() {
        return doSurgery;
    }

    public void setDoSurgery(String doSurgery) {
        this.doSurgery = doSurgery;
    }

    public String getDoExamination() {
        return doExamination;
    }

    public void setDoExamination(String doExamination) {
        this.doExamination = doExamination;
    }

    public String getGiveMedicine() {
        return giveMedicine;
    }

    public void setGiveMedicine(String giveMedicine) {
        this.giveMedicine = giveMedicine;
    }
}
