package com.echoneko.whatsyourbmi;

import java.text.DecimalFormat;

public class bmiCalculator {

    public static void main(String[] args) {

        myBMI(5, 7, 125);

    }

    public static double myBMI (int heightInFeet, int remainingInches, int weightInLb) {

        int feetInInches = heightInFeet * 12;
        int totalHeightInInches = feetInInches + remainingInches;
        double inchesSquared = totalHeightInInches * totalHeightInInches;

        double bmiScore = 703*(weightInLb / inchesSquared) ;
        DecimalFormat bmiDecimal = new DecimalFormat("#.0");

        System.out.println("With a height of " + heightInFeet + " ft. and " + remainingInches + " in. and a weight of " + weightInLb + " lbs.,");
        System.out.println("You're BMI is " + bmiDecimal.format(bmiScore) + ".");
        return 0;
    }
}
