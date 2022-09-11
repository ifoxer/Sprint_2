package service;

import model.Food;

public class ShoppingCart {

    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getSumForDiscount(Food[] foods) {
        double sum = 0;
        for (int i = 0; i < foods.length; i++) {
            sum += foods[i].getTotalPrice();
        }
        return sum;
    }

    public void getSumWithoutDiscount() {

    }

    public void getSumDiscountForVegan() {

    }

}
