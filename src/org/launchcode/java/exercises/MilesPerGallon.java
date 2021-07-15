package org.launchcode.java.exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        double miles;
        double gallons;
        double milesPerGallon;
        Scanner input = new Scanner(System.in);
        System.out.println("Miles driven: ");
        miles = input.nextDouble();
        System.out.println("Gallons of gas used: ");
        gallons = input.nextDouble();
        input.close();

        milesPerGallon = miles/gallons;
        System.out.println("Your car has used " + milesPerGallon + "mpg.");
    }
}
