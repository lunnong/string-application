package com.pluralsight;

public class Receipt {
    static void main(String[] args) {
        String itemName;
        double itemPrice;
        int amount;
        itemName = "apple";
        itemPrice = 7.10;
        amount = 3;
        if (amount > 1) {
            System.out.println("You bought " + amount + "s " + itemName + " for $" + itemPrice + " each.");
        }
        else {
            System.out.println("You bought " + amount + " " + itemName + " for $" + itemPrice +  " each.");
        }
    }
}
