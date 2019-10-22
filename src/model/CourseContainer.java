package model;
import java.util.ArrayList;


/**
 * Write a description of class CourseContainer here.
 *
 * @author Mogens Holm Iversen
 * @version 0.1.0 first draft version
 */
public class CourseContainer {
    private static CourseContainer instance;
    /**
     * Constructor for objects of class CourseContainer
     */
    private CourseContainer() {
        // initialise instance variables
        //TODO create and initialise the collection of courses
    }

    public static CourseContainer getInstance() {
        if (instance == null) {
            instance = new CourseContainer();
        }
        return instance;
    }
}
