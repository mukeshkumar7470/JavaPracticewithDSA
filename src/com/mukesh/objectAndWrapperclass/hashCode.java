package com.mukesh.objectAndWrapperclass;

public class hashCode {
    public static void main(String[] args) {
        FoodHash foodOne = new FoodHash();
        foodOne.setFoodName("Sandwich");
        foodOne.setCuisine("Continental");
        foodOne.setFoodType("Veg");
        foodOne.setQuantityAvailable(100);
        foodOne.setUnitPrice(10);

        FoodHash foodTwo = new FoodHash();
        foodTwo.setFoodName("Sandwich");
        foodTwo.setCuisine("Continental");
        foodTwo.setFoodType("Veg");
        foodTwo.setQuantityAvailable(200);
        foodTwo.setUnitPrice(10);

        if (foodOne.equals(foodTwo)) {
            System.out.println("foodOne and foodTwo are same!");
        } else {
            System.out.println("foodOne and foodTwo are different!");
        }

        System.out.println("Hash code for foodOne : " + foodOne.hashCode());
        System.out.println("Hash code for foodTwo : " + foodTwo.hashCode());

        FoodHash foodThree = new FoodHash();
        foodThree.setFoodName("Burger");
        foodThree.setCuisine("Continental");
        foodThree.setFoodType("Veg");
        foodThree.setQuantityAvailable(100);
        foodThree.setUnitPrice(10);

        if (foodOne.equals(foodThree)) {
            System.out.println("foodOne and foodThree are same!");
        } else {
            System.out.println("foodOne and foodThree are different!");
        }

        System.out.println("Hash code for foodOne : " + foodOne.hashCode());
        System.out.println("Hash code for foodThree : " + foodThree.hashCode());

    }
}

class FoodHash {

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

    // equals method of Object class overridden for comparing two FoodHash objects
    // based on foodName and foodType
    @Override
    public boolean equals(Object obj) {
        FoodHash otherFood = (FoodHash) obj;
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
}
