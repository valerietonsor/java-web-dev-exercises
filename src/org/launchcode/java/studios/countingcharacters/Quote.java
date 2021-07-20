package org.launchcode.java.studios.countingcharacters;
import java.util.*;

public class Quote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        HashMap<Character, Integer> charCount = new HashMap<>();

        System.out.println("Enter a string...");
        str = input.nextLine();

        ArrayList<Character> charArr = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            charArr.add(str.charAt(i));
        }

        for (int i = 0; i < charArr.size(); i++) {
            Integer count = Collections.frequency(charArr, charArr.get(i));
            charCount.put(charArr.get(i), count);
        }

        System.out.println(charCount);
    }

}
