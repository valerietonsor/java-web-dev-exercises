package org.launchcode.java.demos.lsn4classes2;

public class Main {

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
        System.out.println(sally.getGradeLevel());
        System.out.println(sally);
        sally.addGrade(100, 2.4);
        System.out.println(sally);
        System.out.println(sally.getGradeLevel());
        sally.getStudentId();

    }
}
