package com.syeda;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Java Temperature converter");
        System.out.println("🌡️🌡️🌡️🌡️🌡️🌡️🌡️🌡️🌡️");
        System.out.println("a. C -> F  b. F -> C");
        System.out.print("Type in a option from above to start converting: ");
        String option = input.nextLine();
        System.out.print("Please enter a temp: ");
        float temp = input.nextFloat();
        System.out.println("You hve selected option: "+ option);
        if (option.equals("a")) {
            System.out.println("Input temp in C: " + temp);
            float tempF = (temp * 9/5) + 32;
            System.out.println("The temperature in F is: " + tempF);
        }
        else {
            System.out.println("Input temp in F: " + temp);
            float tempC = (temp - 32) * 5/9;
            System.out.println("The temperature in C is: " + tempC);
        }

    }
}
