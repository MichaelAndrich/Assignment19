/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Michael Andrich
 */
/*
    prompt user for their height and weight in inches and pounds respectively
    calculate the BMI of user by using formula given
    output whether they are in the idea range or should see a doctor


 */


import java.util.Scanner;

public class solution19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a your weight in pounds: ");
        double w = sc.nextDouble();

        System.out.println("Enter your height in inches: ");
        double h = sc.nextDouble();


        double BMI = (w / (h * h)) * 703;

        System.out.println("Your BMI is " + (BMI) + "");

        if (BMI >= 18.5 && BMI <= 32.5) {

            System.out.println("You are in normal shape");
        } else if (BMI < 18.5) {
            System.out.println("You are underweight and you should see a doctor.");
        } else if (BMI > 32.5) {
            System.out.println("You are overweight and should see a doctor.");
        }

    }
}