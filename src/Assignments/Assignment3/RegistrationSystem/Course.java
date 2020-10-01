package Assignments.Assignment3.RegistrationSystem;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private int numberOfStudent; // A course can have a maximum number of 10 students registered in it.
    private List<Student> students = new ArrayList<>();

    public Course() {
        super();
    }

    public Course(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public void registerStudent (Student student){
        if (students.size()<10){
            students.add(student);
            this.setNumberOfStudent(this.getNumberOfStudent()+1);
        }
    }

    public List<Student> getStudents(){
        return students;
    }

    public boolean isFull(){
        if(this.getNumberOfStudent()<10){
            return false;
        }else{
            return true;
        }
    }


}
