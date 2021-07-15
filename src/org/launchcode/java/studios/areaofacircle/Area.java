package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;
        do {
            System.out.println("What is the radius of the circle? ");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next(); // this is important!
            }
            radius = sc.nextInt();
        } while (radius <= 0);
        Double area = Circle.getArea(radius);
        System.out.println("The area of the circle is " + area + ".");

        while (radius < 0) {
            System.out.println("Please enter a positive number: ");
            radius = sc.nextInt();

        }

    }
}
