package model;


/**
 * Description of Student goes here.
 *
 * @author Mogens Holm Iversen
 * @version 0.1.0 initial draft version
 */
public class Student {
    // instance variables
    private String name;
    private String address;
    private String mail;

    /**
     * Constructor for objects of Student
     */
    public Student(String name, String address, String mail) {
        // initialise instance variables
        this.name = name;
        this.address = address;
        this.mail = mail;
    }

    //set and get method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    //other methods
}
