package org.launchcode.java.exercises.technology;

public class SmartPhone extends Computer {
    private int photos;

    public SmartPhone(String operatingSystem, int memory, int programCount, int photos){
        super(operatingSystem, memory, programCount);
        this.photos = photos;
    }

}
