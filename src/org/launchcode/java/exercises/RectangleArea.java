package org.launchcode.java.exercises;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        int width;
        int height;
        int area;
        Scanner input = new Scanner(System.in);
        System.out.println("Rectangle width is ... in centimeters: ");
        width = input.nextInt();
        System.out.println("Rectangle height is ... in centimeters: ");
        height = input.nextInt();
        input.close();

        area = width * height;
        System.out.println("The area of the rectangle is:"  + area + "cms");

    }

}
