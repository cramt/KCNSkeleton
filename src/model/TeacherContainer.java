package model;
import java.util.ArrayList;


/**
 * Write a description of class TeacherContainer here.
 *
 * @author Mogens Holm Iversen
 * @version 0.1.0 Initial draft version
 */
public class TeacherContainer {
    // instance variables - replace the example below with your own
    private static TeacherContainer instance;
    private ArrayList<Teacher> teachers;
    /**
     * Constructor for objects of class TeacherContainer
     */
    private TeacherContainer() {
        // initialise instance variables
        teachers = new ArrayList<>();

    }


    public static TeacherContainer getInstance(){
        if (instance == null) {
            instance = new TeacherContainer();
        }

        return instance;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

}
