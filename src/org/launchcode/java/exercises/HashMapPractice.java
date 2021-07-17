package org.launchcode.java.exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Enter your IDs (or '0' to finish):");

        // Get student names and grades
        do {

            System.out.print("Name: ");
            name = input.nextLine();

            if (!name.equals("")) {
                System.out.print("ID: ");
                Integer studentID = input.nextInt();
                students.put(studentID, name);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!name.equals(""));
        input.close();
        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + " (" + student.getKey() + ")");
        }
        System.out.println("\nEND OF ROSTER");

    }
}

