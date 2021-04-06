package com.mukesh.javaBasic.objectAndWrapperclass;

class FoodToString {

    private String foodName;
    private String cuisine;
    private String foodType;
    private int quantityAvailable;
    private double unitPrice;

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // equals method of Object class overridden for comparing two FoodToString objects
    // based on foodName and foodType
    @Override
    public boolean equals(Object obj) {
        FoodToString otherFood = (FoodToString) obj;
        if (this.foodName.equals(otherFood.foodName)) {
            if (this.foodType.equals(otherFood.foodType))
                return true;
        }
        return false;
    }

    // hashCode method overridden
    @Override
    public int hashCode() {
        int result = 1;
        result = result + (foodName.hashCode());
        return result;
    }

    // toString is overridden to provide a custom textual representation
    @Override
    public String toString() {
        return "FoodToString -> " + "FoodToString name: " + this.foodName + ", Cuisine: "
                + this.cuisine + ", FoodToString type: " + this.foodType
                + ", Quantity avaialable: " + this.quantityAvailable
                + ", unitPrice: " + unitPrice;
    }
}


public class toStringMethodTryout {
    public static void main(String[] args) {
        FoodToString foodOne = new FoodToString();
        foodOne.setFoodName("Sandwich");
        foodOne.setCuisine("Continental");
        foodOne.setFoodType("Veg");
        foodOne.setQuantityAvailable(100);
        foodOne.setUnitPrice(10);

        // Comment the toString() in the FoodToString class and execute the code
        System.out.println(foodOne);
    }
}
