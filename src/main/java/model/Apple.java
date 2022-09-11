package model;

import static model.constants.Colour.redColour;
import static model.constants.Discount.discountRedApple;

public class Apple extends Food{

    public int amount;
    public double price;
    public boolean isVegetarian = true;
    public String colour;

    public Apple(int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;

    }

}
