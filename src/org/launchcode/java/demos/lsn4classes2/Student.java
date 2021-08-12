package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;


    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


     //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel() {
        String gradeLevel;
        // Determine the grade level of the student based on numberOfCredits
        if (this.numberOfCredits >= 90) {
            gradeLevel = "Senior";
        } else if (this.numberOfCredits >= 60) {
            gradeLevel = "Junior";
        } else if (this.numberOfCredits >= 30) {
            gradeLevel = "Sophomore";
        } else {
            gradeLevel = "Freshman";
        }
        return gradeLevel;
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa


      double totalQualityScore = this.gpa * this.numberOfCredits;
      totalQualityScore += courseCredits * grade;
       numberOfCredits += courseCredits;
       gpa = totalQualityScore / numberOfCredits;

        System.out.println(numberOfCredits);
        System.out.println(gpa);
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", grade level = " + this.getGradeLevel() +
                ", gpa=" + gpa +
                '}';
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.


    @Override
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared) return true;
        if (toBeCompared == null) return false;
        if (!(toBeCompared instanceof Student)) return false;
        Student student = (Student) toBeCompared;
        return getStudentId() == student.getStudentId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentId());
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }


}
