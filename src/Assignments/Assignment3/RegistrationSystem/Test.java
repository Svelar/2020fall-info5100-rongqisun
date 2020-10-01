package Assignments.Assignment3.RegistrationSystem;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Course info5100 = new Course("info5100");
        Course info5100lab = new Course("info5100lab");
        Student Sun = new Student("Sun",1);
        Student Lee = new Student("Lee",2);
        Student Xi = new Student("Xi",3);
        info5100.registerStudent(Sun);
        info5100.registerStudent(Lee);
        info5100lab.registerStudent(Xi);

        System.out.println(info5100.isFull());
        System.out.println(info5100lab.isFull());
        System.out.println(info5100.getName());
        System.out.println(info5100lab.getNumberOfStudent());
        List<Student> students = info5100.getStudents();
        for (Student student:
             students) {
            System.out.println(student.getName());
        }


/*  Output:
        false
        false
        info5100
        1
        Sun
        Lee*/

    }
}
