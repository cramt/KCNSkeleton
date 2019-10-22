package controller;
import model.*;


/**
 * Write a description of class CourseController here.
 *
 * @author Mogens Holm Iversen
 * @version 0.1.0 first draft version
 */
public class CourseController {
    private CourseContainer courseContainer;

    /**
     * Constructor for objects of class CourseController
     */
    public CourseController() {
        // initialise instance variables
        courseContainer = CourseContainer.getInstance();

    }
}
