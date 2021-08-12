package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    //fields
    private String topic;
    private ArrayList<Student> enrolledStudents;
    private Teacher instructor;

    //constructor
    public Course (String topic, Teacher instructor, ArrayList<Student> enrolledStudents){
        this.topic = topic;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
    }

    //getters & setters
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }



    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.

    @Override
    public String toString() {
        return "Course{" +
                "topic='" + topic + '\'' +
                ", instructor=" + instructor +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.


    @Override
    public boolean equals(Object toBeCompared) {
        if (this == toBeCompared){
            return true;
        }
        if (toBeCompared == null){
            return false;
        }
        if (!(toBeCompared instanceof Course)){
            return false;
        }
        Course course = (Course) toBeCompared;
        return Objects.equals(getTopic(), course.getTopic()) && Objects.equals(instructor, course.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTopic(), instructor);
    }
}
