package org.launchcode.java.studios.countingcharacters;
import java.util.*;

public class Quote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;

        HashMap<Character, Integer> charCount = new HashMap<>();

        System.out.println("Enter a string...");
        str = input.nextLine().toLowerCase();
        String newStr = str.replaceAll( "[^a-zA-Z]", "");

        ArrayList<Character> charArr = new ArrayList<>();
        for (int i = 0; i < newStr.length(); i++) {
            charArr.add(newStr.charAt(i));
        }

        for (int i = 0; i < charArr.size(); i++) {
            Integer count = Collections.frequency(charArr, charArr.get(i));
            charCount.put(charArr.get(i), count);
        }

        System.out.println(charCount);
    }

}
