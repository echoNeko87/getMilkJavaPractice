package com.echoneko.getmilk;

public class MyClass {

    public static void main(String[] args) {

        getMilk(25, 2);
    }

    public static int getMilk(int startingAmountOfMoney, int quantityOfMilk) {

        int priceOfMilk = 2;
        int newAmountOfMoney = startingAmountOfMoney - priceOfMilk;

        System.out.println("Go outside");
        System.out.println("Walk to the store.");
        System.out.println("Pick up " + quantityOfMilk + " cartons of milk from the bottom shelf");
        System.out.println("Pay the cashier $" + (priceOfMilk * quantityOfMilk));
        System.out.println("You had $" + startingAmountOfMoney + " in your wallet");
        System.out.println("You now have $" + newAmountOfMoney + " left in your wallet");
        System.out.println("Return home");
        System.out.println("Enjoy some delicious milk");

        return 0;
    }
}
