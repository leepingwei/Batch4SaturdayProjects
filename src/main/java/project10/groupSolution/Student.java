package project10.groupSolution;

import java.time.LocalDate;
import java.util.Scanner;

public class Student extends User {

    Book book = new Book();
    private static int BorrowedBookQty = 0;

    public Student(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome Student!" +
                "\n1. Check out a book" +
                "\n2. Check in a book" +
                "\n0. Quit" +
                "\nMake a choice:\t");
        int option = scanner.nextInt();
        switch (option){
            case 1:
                System.out.print("Input book id for borrow a book:\t");
                String id = scanner.nextLine();
                studentCheckOutBook(id);
                break;
            case 2:
                System.out.print("Input book id for return:\t");
                String returnId = scanner.nextLine();
                book.checkInBook(returnId);
                break;
            case 0:
        }
    }

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
        userID = "3" + setUserID();
    }

    public void studentCheckOutBook(String id){
        BorrowedBookQty++;
        if(book.checkOutBook(id) && BorrowedBookQty <= 3){
            checkOutDate = LocalDate.now();
            dueDate = checkOutDate.plusDays(14);
            System.out.println("It has successfully been checked out." +
                    "\nYour check out date is: " + checkOutDate +
                    "\nYour due date for return the book is: " + dueDate);
        }else{
            System.out.println("Sorry, this book is not available to be checked out.");
        }
    }
}
