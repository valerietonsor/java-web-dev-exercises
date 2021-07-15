package org.launchcode.java.exercises;
import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String str = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in it, 'and what is the use of a " +
                "book,' thought Alice 'without pictures or conversation?'";
        String searchTerm;
        String newStr;
        String newStrSpacing;
        Scanner input = new Scanner(System.in);
        System.out.println("Search for a word... ");
        searchTerm = input.nextLine();
        input.close();

        System.out.println(str.toLowerCase().contains(searchTerm.toLowerCase()));
        System.out.println(searchTerm.length());
        System.out.println(str.indexOf((searchTerm)));
        newStr = str.toLowerCase().replaceAll(searchTerm.toLowerCase(), "");
        newStrSpacing = newStr.replaceAll("\\s+", " ");

        System.out.println(newStrSpacing.trim());
    }
}
