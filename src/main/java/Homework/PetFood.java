package Homework;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class PetFood {

    private String foodName;
    private double price;
    private int quantity;
    private boolean stockAvailability;
    private String ingredients;
    private LocalDate expirationDate;



//    public PetFood(LocalDate expirationDate) {
//        this.expirationDate = expirationDate;
//
//    }


    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isStockAvailability() {
        return stockAvailability;
    }

    public void setStockAvailability(boolean stockAvailability) {
        this.stockAvailability = stockAvailability;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }



    @Override
    public String toString() {
        return "Track{" +
                "name='" + foodName + '\'' +
                ", expiration date: " + expirationDate +
                '}';
    }
}










