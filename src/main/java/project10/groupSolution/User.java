package project10.groupSolution;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {

    private String firstName;
    private String lastName;
    protected String userID;
    protected LocalDate checkOutDate;
    protected LocalDate dueDate;
    static List<User> users = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public User(){}

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        setUserID();
    }

    public String setUserID(){
        int id = (int)(Math.random() * 899) + 100;
        return String.valueOf(id);
    }

    public String toString(){
        return "Name:\t" + firstName + " " + lastName +
                "\nUser ID:\t" + userID;
    }

    public List<User> addLibrarian(){
        System.out.print("Input first name:\t");
        firstName = scanner.nextLine();
        System.out.print("Input last name:\t");
        lastName = scanner.nextLine();
        users.add(new Librarian(firstName, lastName));
        return users;
    }

    public List<User> addTeacher(){
        System.out.print("Input first name:\t");
        firstName = scanner.nextLine();
        System.out.print("Input last name:\t");
        lastName = scanner.nextLine();
        users.add(new Teacher(firstName, lastName));
        return users;
    }

    public List<User> addStudent(){
        System.out.print("Input first name:\t");
        firstName = scanner.nextLine();
        System.out.print("Input last name:\t");
        lastName = scanner.nextLine();
        users.add(new Student(firstName, lastName));
        return users;
    }
}
