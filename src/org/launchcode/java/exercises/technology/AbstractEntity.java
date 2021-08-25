package org.launchcode.java.exercises.technology;

public abstract class AbstractEntity {
    private static int id = 0;

    public static synchronized void generateId() {
        id = id++;
    }

    public int getId() {
        return id;
    }
}
