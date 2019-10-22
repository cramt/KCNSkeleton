package controller;
import model.*;


/**
 * Write a description of class StudentController here.
 *
 * @author Mogens Holm Iversen
 * @version 0.1.0 first draft version
 */
public class StudentController {

    private StudentContainer studentContainer;

    /**
     * Constructor for objects of class StudentController
     */
    public StudentController() {
        // initialise instance variables
        studentContainer = StudentContainer.getInstance();
    }

    public void createStudent(String name, String address, String mail) {
        Student student = new Student(name, address, mail);
        studentContainer.addStudent(student);

    }

    public Student createController(String name, String address, String mail){
        Student student = new Student(name, address, mail);
        studentContainer.addStudent(student);
        return student;
    }
}
