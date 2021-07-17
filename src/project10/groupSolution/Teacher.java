package project10.groupSolution;

import java.time.LocalDate;
import java.util.Scanner;

public class Teacher extends User {

    Book book = new Book();
    private static int BorrowedBookQty = 0;

    public Teacher(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome Teacher!" +
                "\n1. Check out a book" +
                "\n2. Check in a book" +
                "\n0. Quit" +
                "\nMake a choice:\t");
        int option = scanner.nextInt();
        switch (option){
            case 1:
                System.out.print("Input book id for borrow a book:\t");
                String borrowId = scanner.nextLine();
                teacherCheckOutBook(borrowId);
                break;
            case 2:
                System.out.print("Input book id for return:\t");
                String returnId = scanner.nextLine();
                book.checkInBook(returnId);
                break;
            case 0:
        }
    }

    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
        userID = "2" + setUserID();
    }

    public void teacherCheckOutBook(String id){
        BorrowedBookQty++;
        if(book.checkOutBook(id) && BorrowedBookQty <= 5){
            checkOutDate = LocalDate.now();
            dueDate = checkOutDate.plusDays(21);
            System.out.println("It has successfully been checked out." +
                    "\nYour check out date is: " + checkOutDate +
                    "\nYour due date for return the book is: " + dueDate);
        }else{
            System.out.println("Sorry, this book is not available to be checked out.");
        }
    }
}
