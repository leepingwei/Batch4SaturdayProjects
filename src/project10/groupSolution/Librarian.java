package project10.groupSolution;

import java.time.LocalDate;
import java.util.Scanner;

public class Librarian extends User {

    Book book = new Book();
    Teacher teacher;
    Student student;
    private static int BorrowedBookQty = 0;

    public Librarian(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome Librarian!" +
                "\n1. Check out a book for myself" +
                "\n2. Check out a book for a user" +
                "\n3. Check in a book" +
                "\n4. Register a book" +
                "\n5. Register a user" +
                "\n0. Quit" +
                "\nMake a choice:\t");
        int option = scanner.nextInt();
        switch (option){
            case 1:
                System.out.print("Input book id:\t");
                String id = scanner.nextLine();
                librarianCheckOutBook(id);
                break;
            case 2:
                System.out.print("Which user do you want to help to check out?" +
                        "\n1. Teacher" +
                        "\n2. Student" +
                        "\n0. Quit" +
                        "\nMake a choice:\t");
                int optionInnerCase2 = scanner.nextInt();
                switch (optionInnerCase2) {
                    case 1:
                        teacher = new Teacher();
                        break;
                    case 2:
                        student = new Student();
                        break;
                    case 0:
                }
                break;
            case 3:
                System.out.print("Input book ID for return:\t");
                String returnBookID = scanner.nextLine();
                book.checkInBook(returnBookID);
                break;
            case 4:
                System.out.print("Which type of book do you want to register?" +
                        "\n1. Fiction Book" +
                        "\n2. Non-Fiction Book" +
                        "\n3. Reference Book" +
                        "\n0. Quit" +
                        "\nMake a choice:\t");
                int optionInnerCase4 = scanner.nextInt();
                switch(optionInnerCase4){
                    case 1:
                        book.addFictionBook();
                        System.out.println("You has successfully create a Fiction Book!");
                        break;
                    case 2:
                        book.addNonFictionBook();
                        System.out.println("You has successfully create a Non-Fiction Book!");
                        break;
                    case 3:
                        book.addReferenceBook();
                        System.out.println("You has successfully create a Reference Book!");
                    case 0:
                }
                System.out.println(book.books);
                break;
            case 5:
                System.out.print("What kind of user do you want to register?" +
                        "\n1. Librarian" +
                        "\n2. Teacher" +
                        "\n3. Student" +
                        "\n0. Quit" +
                        "\nMake a choice:\t");
                int optionInnerCase5 = scanner.nextInt();
                switch (optionInnerCase5){
                    case 1:
                        addLibrarian();
                        System.out.println("You has successfully create a Librarian account!");
                        break;
                    case 2:
                        addTeacher();
                        System.out.println("You has successfully create a Teacher account!");
                        break;
                    case 3:
                        addStudent();
                        System.out.println("You has successfully create a Student account!");
                    case 0:
                }
                System.out.println(users);
                break;
            case 0:
        }
    }

    public Librarian(String firstName, String lastName) {
        super(firstName, lastName);
        userID = "1" + setUserID();
    }

    public void librarianCheckOutBook(String id){
        BorrowedBookQty++;
        if(book.checkOutBook(id) && BorrowedBookQty <= 10){
            checkOutDate = LocalDate.now();
            dueDate = checkOutDate.plusDays(30);
            System.out.println("It has successfully been checked out." +
                    "\nYour check out date is: " + checkOutDate +
                    "\nYour due date for return the book is: " + dueDate);
        }else{
            System.out.println("Sorry, this book is not available to be checked out.");
        }
    }
}
