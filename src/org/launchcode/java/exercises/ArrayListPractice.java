package org.launchcode.java.exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(22);
        nums.add(3);
        nums.add(47);
        nums.add(55);
        nums.add(68);
        nums.add(7);
        nums.add(89);
        nums.add(99);
        nums.add(102);

        System.out.println("The sum of the even numbers in the array is " + sum(nums));
    }


    public static int sum(ArrayList<Integer> array) {
        int sum = 0;
        for (int i = 0; i < array.size(); i++){
            if (array.get(i) % 2 == 0){
                sum += array.get(i);
            }
        }
        return sum;
    }
}
