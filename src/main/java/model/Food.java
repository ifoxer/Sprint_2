package model;
public abstract class Food {

   private int amount;
   private double price;
   private boolean isVegetarian;

   public Food(int amount, double price) {
      this.amount = amount;
      this.price = price;
   }

   public int getAmount() {
      return amount;
   }

   public double getPrice() {
      return price;
   }

   public boolean isVegetarian() {
      return isVegetarian;
   }

   public double getTotalPrice(){
      return amount * price;
   }

}
