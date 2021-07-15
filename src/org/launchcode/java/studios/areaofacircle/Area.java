package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        System.out.println("What is the radius of the circle? ");


        if (!input.hasNextInt())
            System.out.println("This is not a number!");

        radius = input.nextDouble();

        while (radius < 0) {
            System.out.println("Please enter a positive number: ");
            radius = input.nextDouble();


        }

        Double area = Circle.getArea(radius);
        System.out.println("The area of the circle is " + area + ".");

    }
}
