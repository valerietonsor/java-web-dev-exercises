package org.launchcode.java.exercises.technology;

public class Main {
    public static void main(String[] args) {
     SmartPhone valerieCell = new SmartPhone("iOS", 32, 55, 1094);
     Laptop valeriePersonal = new Laptop("iOS", 500, 109, true);
      valerieCell.generateId();
    valeriePersonal.generateId();
        System.out.println(valerieCell.getId());
        System.out.println(valeriePersonal.getId());


    }
}
