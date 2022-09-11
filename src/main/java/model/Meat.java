package model;

public class Meat extends Food{

    public int amount;
    public double price;

    public boolean isVegetarian = false;



    public Meat(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }
}
