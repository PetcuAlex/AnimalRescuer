package Homework;

public class Dog extends Animal {

   private String talk;
   private String breed;
   private String furColor;


   @Override
   public void expressHappines() {
      System.out.println(getName() + " is wagging");
   }

   public Dog(String name, String breed) {
      super(name);
      this.breed = breed;
   }

   public Dog(String name) {
      super(name);
   }

   public String getTalk() {
      return talk;
   }

   public void setTalk(String talk) {
      this.talk = talk;
   }

   public String getSpecies() {
      return breed;
   }

   public void setSpecies(String species) {
      this.breed = species;
   }

   public String getFurColor() {
      return furColor;
   }

   public void setFurColor(String furColor) {
      this.furColor = furColor;
   }
}
