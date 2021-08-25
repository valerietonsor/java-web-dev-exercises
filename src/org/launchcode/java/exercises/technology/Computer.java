package org.launchcode.java.exercises.technology;

public class Computer extends AbstractEntity {
    private String operatingSystem;
    private int memory;
    private int programCount;

    public Computer (String operatingSystem, int memory, int programCount){
        super();
        this.operatingSystem = operatingSystem;
        this.memory = memory;
        this.programCount = programCount;

    }


    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getProgramCount() {
        return programCount;
    }

    public void setProgramCount(int programCount) {
        this.programCount = programCount;
    }
}
