package Homework;

public class Mammals extends Animal {

   private String talk;
   private String species;
   private String furColor;

   public Mammals(String name) {
      super(name);
   }

   public String getTalk() {
      return talk;
   }

   public void setTalk(String talk) {
      this.talk = talk;
   }

   public String getSpecies() {
      return species;
   }

   public void setSpecies(String species) {
      this.species = species;
   }

   public String getFurColor() {
      return furColor;
   }

   public void setFurColor(String furColor) {
      this.furColor = furColor;
   }
}
