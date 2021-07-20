package org.launchcode.java.demos.lsn3classes1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Course {
   private String subject;
   private int creditHours;
   private ArrayList<Student> roster;

    public String getSubject(){
        return subject;

    }

    public void setSubject(String aSubject){
        this.subject = aSubject;
    }

    public int getCreditHours(){
        return creditHours;

    }

    public void setCreditHours(int aCreditHours){
        this.creditHours = aCreditHours;
    }

    public ArrayList<Student> getRoster(){
        return roster;

    }

    public void setRoster(ArrayList<Student> aRoster){
        this.roster = aRoster;
    }

}
