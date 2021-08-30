/*
 *  UCF COP3330 Fall 2021 Exercise 6 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your current age? ");
        String currentAgeStr = scanner.nextLine();
        System.out.println("At what age would you like to retire? ");
        String retireAgeStr = scanner.nextLine();

        int currentAge = Integer.parseInt(currentAgeStr);
        int retireAge = Integer.parseInt(retireAgeStr);

        int yearsLeft = retireAge - currentAge;

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int retireYear = currentYear + yearsLeft;

        System.out.println("You have " + yearsLeft + " years left until you can retire.");
        System.out.println("It's " + currentYear + ", so you can retire in " + retireYear + ".");
    }
}