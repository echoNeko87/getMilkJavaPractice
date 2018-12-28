package com.echoneko.couldthisbelove;

import java.util.Random;

public class loveCalculator {

    public static void main(String[] args) {

        System.out.println("Their love score is " + ifYouHadMyLove("Miss.", "Mr.") + ".");
    }


    public static int ifYouHadMyLove(String yourName, String theirName) {

        Random randomObject = new Random();
        int loveScore = randomObject.nextInt(101);

        if (loveScore > 80) {
            System.out.println(yourName + " and " + theirName + " are a match made in heaven.");
        } else if (loveScore > 40) {
            System.out.println(yourName + " and " + theirName + " are the best of friends.");
        } else {
            System.out.println(yourName + " and " + theirName + " should get out while they still can!");
        }

        return loveScore;
    }
}
