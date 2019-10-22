package ui;
import java.util.Scanner;
import controller.CourseController;


/**
 * Write a description of class CourseUI here.
 *
 * @author Mogens Holm Iversen
 * @version 0.1.0 first draft version
 */
public class CourseUI {

    private CourseController courseController;

    /**
     * Constructor for objects of class CourseUI
     */
    public CourseUI() {
        courseController = new CourseController();

    }

    public void start(){
        courseMenu();
    }

    private void courseMenu(){
        boolean exit = false;
        while(!exit) {
            int choice = writeCourseMenu();
            switch (choice) {
                case 1:   //opret kursus
                    createCourse();
                    break;
                case 2://find kursus
                    //TODO add this when controller and model are implementedCourse course = findCourse();
                    System.out.println("Du skal huske at implementere find kursus når du når til den opgave");
                    //System.out.println(" Kursets navn er:" + course.getName());
                    break;
                default:
                    exit = true;
                    break;
            }//end switch

        }//end while

    }

    private int writeCourseMenu() {
        // makes an object keyboard to read input from the screen
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Kursus Menu ***");
        System.out.println(" (1) Opret et kursus");
        System.out.println(" (2) Find et kursus");
        System.out.println(" (3) Afslut");
        System.out.print("\n Vælg: ");

        while (!keyboard.hasNextInt()){

            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }
        int choice = keyboard.nextInt();
        return choice;
    }

    private String inputCourseName() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Angiv kursets navn:  ");
        String name = keyboard.nextLine();
        return name;
    }

    private String inputCourseDescription(){

        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Angiv kursus beskrivelse:  ");
        String description = keyboard.nextLine();
        return description;
    }

    private int inputPrice(){
        boolean ok = false;
        int id = 0;
        Scanner keyboard = new Scanner(System.in);
        // makes an object keyboard to have input from the console
        System.out.println(" Angiv kursets pris:  ");
        while (!keyboard.hasNextInt()){

            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }
        id = keyboard.nextInt();
        return id;
    }

    private int inputNumber(){

        boolean ok = false;
        int number = 0;
        Scanner keyboard = new Scanner(System.in);
        while (!keyboard.hasNextInt()){

            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }
        number = keyboard.nextInt();
        return number;

    }

    private String inputTime() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Angiv tidspunkt:  ");
        String time = keyboard.nextLine();
        return time;
    }

    private String inputRoom() {

        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Angiv lokale:  ");
        String room = keyboard.nextLine();
        return room;
    }

    private String inputStatus() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Angiv status:  ");
        String status = keyboard.nextLine();
        return status;
    }

    private void showName(String name) {
        System.out.println("Kursets navn: " + name);
    }

    private void showPrice(int price) {
        System.out.println("Kursets pris: " + price);
    }

    private void createCourse() {
        String name = inputCourseName();
        String description = inputCourseDescription();
        int price = inputPrice();
        //TODO add course when implemented in controller courseController.createCourse(name, description, price);
    }
}
