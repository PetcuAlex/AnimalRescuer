package Homework;

public class Fish extends Animal {

   private int finsNumber;
   private boolean needMoreOxygenedWater;

    public Fish(String name) {
        super(name);
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
}
