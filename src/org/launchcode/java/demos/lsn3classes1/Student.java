package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa){
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public int getStudentId(){
        return studentId;
    }

    public void setStudentId(int aStudentId){
       this.studentId = aStudentId;
    }

    public int getNumberOfCredits(){
        return numberOfCredits;
    }

//solutions says for this one to be private ... why this & not gpa, too?
    private void setNumberOfCredits(int aNumberOfCredits){
       this.numberOfCredits = aNumberOfCredits;
    }

    public Double getGpa(){
        return gpa;

    }

    public void setGpa(Double aGpa){
        this.gpa = aGpa;
    }




}
