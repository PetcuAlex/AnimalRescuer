package Homework;

public class Veterinary extends MedicalStaff {

    private String giveDiagnostic;
    private String doSurgery;
    private String doExamination;
    private String giveMedicine;

    public void examinate(Animal animal){
        System.out.println(getName() + " is looking at " + animal.getName());
        System.out.println("Let's see what your pet has!");
        System.out.println("Your pet is ill,so i will give him some pills , and you should feed him to get strength");
    }

    public void giveMedicine( Animal animal){
        System.out.println(getName() + " gave some pills to " + animal.getName());
        animal.setHealth(animal.getHealth() + 3);
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
