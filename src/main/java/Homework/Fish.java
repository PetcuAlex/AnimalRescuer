package Homework;

public class Fish extends Animal {

   private int finsNumber;
   private boolean needMoreOxygenedWater;
   private String species;

    public Fish(String name) {
        super(name);
    }

    public void expressHappiness(String name){

        System.out.println(getName() + " is hiding behind plants");

    }

    public int getFinsNumber() {
        return finsNumber;
    }

    public void setFinsNumber(int finsNumber) {
        this.finsNumber = finsNumber;
    }

    public boolean isNeedMoreOxygenedWater() {
        return needMoreOxygenedWater;
    }

    public void setNeedMoreOxygenedWater(boolean needMoreOxygenedWater) {
        this.needMoreOxygenedWater = needMoreOxygenedWater;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
