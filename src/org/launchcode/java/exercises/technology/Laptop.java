package org.launchcode.java.exercises.technology;

public class Laptop extends Computer{
    private boolean hasCamera;

    public Laptop(String operatingSystem, int memory, int programCount, boolean hasCamera){
        super(operatingSystem, memory, programCount);
        this.hasCamera = hasCamera;
    }
}
