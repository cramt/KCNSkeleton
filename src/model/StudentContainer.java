package model;
import java.util.ArrayList;


/**
 * Write a description of class StudentContainer here.
 *
 * @author Mogens Holm Iversen
 * @version 0.1.0 first draft version
 */
public class StudentContainer {
    private static StudentContainer instance = new StudentContainer();
    private ArrayList<Student> students;
    /**
     * Constructor for objects of class StudentContainer
     */
    private StudentContainer() {
        // initialise instance variables
        students = new ArrayList<>();
    }

    public static StudentContainer getInstance() {
        return instance;
    }

    public void addStudent(Student student){
        for (Student value : students) {
            if (value.getMail().equalsIgnoreCase(student.getMail())) {
                return;
            }
        }
        students.add(student);
    }
}
