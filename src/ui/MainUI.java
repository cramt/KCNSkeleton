package ui;

import java.util.Scanner;


/**
 * Description of MainMenu goes here.
 *
 * @author Mogens Holm Iversen
 * @version 0.1.0 initial draft version
 */
public class MainUI {
    // instancevariables
    private CourseUI courseUI;
    private StudentUI studentUI;


    /**
     * Constructor for objects of MainMenu
     */
    public MainUI() {
        // initialise instancevariables
        courseUI = new CourseUI();
        studentUI = new StudentUI();

    }


    //other methods
    public void start() {
        mainMenu();
    }

    private void mainMenu() {
        boolean exit = false;
        while(!exit) {
            int choice = writeMainMenu();
            switch (choice) {
                case 1:   //course menu
                    courseUI.start();
                    break;
                case 2://student menu
                    studentUI.start();
                    break;
                default:
                    System.out.println("Tak for denne gang.");
                    exit = true;
                    break;
            }//end switch

        }//end while
    }

    private int writeMainMenu(){
        // makes an object keyboard to read input from the screen
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Hovedmenu ***");
        System.out.println(" (1) Kursusmenu");
        System.out.println(" (2) Studentermenu");
        System.out.println(" (3) Afslut");
        System.out.print("\n Vælg: ");

        while (!keyboard.hasNextInt()){

            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }
        int choice = keyboard.nextInt();
        return choice;
    }
}
