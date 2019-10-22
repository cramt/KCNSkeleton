package ui;
import java.util.Scanner;
import controller.*;
import model.*;

/**
 * Write a description of class StudentUI here.
 *
 * @author Mogens Holm Iversen
 * @version 0.1.0 first draft version
 */
public class StudentUI {
    // instance variables - replace the example below with your own
    //TODO add an instance of the controller when available
    private StudentController studentController;

    /**
     * Constructor for objects of class StudentUI
     */
    public StudentUI() {
        // initialise instance variables
        studentController = new StudentController();
    }

    public void start() {

        studentMenu();
    }

    private void studentMenu() {
        boolean exit = false;
        while(!exit)
        {
            int choice = writeStudentMenu();
            if(choice == 1) { //create the student
                createStudent();
            }
            else if (choice == 2) { //find the student
                //Student student=findStudent();
                //System.out.println(" Navnet på kursisten er:" + student.getName());
                System.out.println("Du skal huske at implementere find student når du når til den opgave");
            }
            else {
                exit = true;
            }//end else
        }//end while
    }

    private int writeStudentMenu() {
        // makes an object keyboard to read input from the screen
        int choice = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("*** Kursist Menu ***");
        System.out.println(" (1) Opret en kursist");
        System.out.println(" (2) Find en kursist");
        System.out.println(" (3) Afslut");
        System.out.print("\n Vælg et punkt: ");

        while (!keyboard.hasNextInt()){

            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }
        choice = keyboard.nextInt();
        return choice;
    }

    private int inputStudentID() {
        boolean ok = false;
        int id = 0;
        // makes an object keyboard to have input from the console
        Scanner keyboard = new Scanner(System.in);
        while (!keyboard.hasNextInt()){

            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }
        id = keyboard.nextInt();
        return id;
    }

    private String inputName() {
        // makes an object keyboard to have input from the screen
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Angiv kursistens navn:  ");
        String name = keyboard.nextLine();
        return name;
    }


    private String inputAddress() {
        // makes an object keyboard to read input from the console
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Angiv kursistens adresse: ");
        String address = keyboard.nextLine();
        return address;
    }

    private String  inputMail() {
        // makes an object keyboard to read input from the console
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Angiv kursistens mail: ");
        String mail = keyboard.nextLine();
        return mail;
    }
    private void showId(int id) {
        System.out.println("Kursistens id: " + id);
    }

    private void showName(String name) {
        System.out.println("Kursistens navn: " + name);
    }

    private void showAddress(String address) {
        System.out.println("Kursistens adresse: " + address);
    }

    private void showMail(String mail) {
        System.out.println("Kursistens mail: " + mail);
    }


    private void createStudent() {
        //int id = inputStudentID();
        String name = inputName();
        String address = inputAddress();
        String mail = inputMail();
        //TODO add the functionality which creates the student in the controllayer when it is implemented
        studentController.createStudent(name,address, mail);



    }



}
